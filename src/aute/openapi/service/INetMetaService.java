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
 * 网元部分相关接口
 * @author zhoushibao
 * @version 1.0
 * @since 2014-5-27 11:40:48
 */
@Path(value="/NetMetaService")
public interface INetMetaService {
	/**
	 * 获取所有AC信息的接口
	 * @return List：返回一个infoac的list集合;
	 * 
	 */
	@GET
	@Produces({MediaType.APPLICATION_XML})
	@Path("/getAcInfo")
	public List<InfoAc> getACInfo();
	
	/**
	 * 获取所有AP信息的接口
	 * @return List：返回一个infoFitap的list集合;
	 * 
	 */
	@GET
	@Produces({MediaType.APPLICATION_XML})
	@Path("/getApInfo")
	public List<InfoFitap> getAPInfo();
	
	/**
	 * 获得地域信息接口
	 * @return List:返回一个InfoAreaAp的List集合
	 */
	@GET
	@Produces({MediaType.APPLICATION_XML})
	@Path("/getAreaInfo")
	public List<InfoAreaAp> getAreaInfo();
	
	/**
	 * 获取存储转发数据
	 * @return List:返回一个DataflowStation的List集合
	 */
	@GET
	@Produces({MediaType.APPLICATION_XML})
	@Path("/getStationData/{starttime}/{endtime}")
	public List<DataflowStation> getStationData(@PathParam("starttime") String startTime,@PathParam("starttime") String endTime);
}
