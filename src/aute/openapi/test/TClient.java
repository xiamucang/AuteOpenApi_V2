package aute.openapi.test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import aute.openapi.service.INetMetaService;
/**
 * 客户端连接测试用例
 * @author zhoushibao
 * @version 1.0
 * @since 2014-5-27 13:55:45
 *
 */
public class TClient {
	@Test
	public void TConnection(){
		Logger log = LoggerFactory.getLogger(TClient.class);
		log.debug("开始连接webservice");
		JaxWsProxyFactoryBean cpf = new JaxWsProxyFactoryBean();
		cpf.setAddress("http://localhost:8080/AuteOpenApi_V2/NetMetaService/NetMetaService/getAcInfo");
		cpf.setServiceClass(INetMetaService.class);
		INetMetaService hws = (INetMetaService) cpf.create();
		System.out.println(hws.getACInfo().get(0).getUpdateTime());
		log.debug("结束连接webservice");
	}
	
}
