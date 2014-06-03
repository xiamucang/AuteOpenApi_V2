package aute.openapi.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import aute.openapi.entities.DataflowStation;
import aute.openapi.entities.InfoAc;
import aute.openapi.entities.InfoFitap;
import aute.openapi.vo.InfoAreaAp;
/**
 * ��Ԫ������ؽӿ�
 * @author zhoushibao
 * @version 1.0
 * @since 2014-5-27 11:40:48
 */
@Path(value="/NetMetaService")
public interface INetMetaService {
	/**
	 * ��ȡ����AC��Ϣ�Ľӿ�
	 * @return List������һ��infoac��list����;
	 * 
	 */
	@GET
	@Produces({MediaType.APPLICATION_XML})
	@Path("/getAcInfo")
	public List<InfoAc> getACInfo();
	
	/**
	 * ��ȡ����AP��Ϣ�Ľӿ�
	 * @return List������һ��infoFitap��list����;
	 * 
	 */
	@GET
	@Produces({MediaType.APPLICATION_XML})
	@Path("/getApInfo")
	public List<InfoFitap> getAPInfo();
	
	/**
	 * ��õ�����Ϣ�ӿ�
	 * @return List:����һ��InfoAreaAp��List����
	 */
	@GET
	@Produces({MediaType.APPLICATION_XML})
	@Path("/getAreaInfo")
	public List<InfoAreaAp> getAreaInfo();
	
	/**
	 * ��ȡ�洢ת������
	 * @return List:����һ��DataflowStation��List����
	 */
	@GET
	@Produces({MediaType.APPLICATION_XML})
	@Path("/getStationData/{starttime}/{endtime}")
	public List<DataflowStation> getStationData(@PathParam("starttime") String startTime,@PathParam("starttime") String endTime);
}
