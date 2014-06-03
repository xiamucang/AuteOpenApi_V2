package aute.openapi.service.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import aute.openapi.dao.IAreaApDAO;
import aute.openapi.dao.IDataflowStationDAO;
import aute.openapi.dao.IInfoACDAO;
import aute.openapi.dao.IInfoFitapDAO;
import aute.openapi.entities.DataflowStation;
import aute.openapi.entities.InfoAc;
import aute.openapi.entities.InfoFitap;
import aute.openapi.service.INetMetaService;
import aute.openapi.vo.InfoAreaAp;

/**
 * 网元部分相关接口的实现类
 * 
 * @author zhoushibao
 * @version 1.0
 * @since 2014-5-27 11:44:11
 */
@Path(value = "/NetMetaService")
public class NetMetaServiceImpl implements INetMetaService {
	private IInfoACDAO infoDAO;
	private IInfoFitapDAO infoApDao;
	private IAreaApDAO infoAreaApDao;
	private IDataflowStationDAO stationDataDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see aute.openapi.service.INetMetaService#getACInfo()
	 */
	@Override
	@GET
	@Produces( { MediaType.APPLICATION_XML })
	@Path("/getAcInfo")
	public List<InfoAc> getACInfo() {
		// TODO Auto-generated method stub
		List infoacs = infoDAO.findAll();
		System.out.println("获取AC信息成功，返回条数：" + infoacs.size());
		return infoacs;
	}

	@Override
	@GET
	@Produces( { MediaType.APPLICATION_XML })
	@Path("/getApInfo")
	public List<InfoFitap> getAPInfo() {
		List infoaps = infoApDao.findAll();
		System.out.println("获取AC信息成功，返回条数：" + infoaps.size());
		return infoaps;
	}

	@GET
	@Produces( { MediaType.APPLICATION_XML })
	@Path("/getAreaInfo")
	public List<InfoAreaAp> getAreaInfo() {
		List infoArea = infoAreaApDao.findAreaApInfo();
		System.out.println("获取地域信息成功，返回条数：" + infoArea.size());
		return infoArea;
	}

	@GET
	@Produces( { MediaType.APPLICATION_XML })
	@Path("/getStationData/{starttime}/{endtime}")
	public List<DataflowStation> getStationData(
			@PathParam("starttime") String startTime,
			@PathParam("endtime") String endTime) {
		List stationData = stationDataDao.findStationData(startTime,endTime);
		System.out.println("获取存储转发数据成功，返回条数：" + stationData.size());
		return stationData;
	}

	public IDataflowStationDAO getStationDataDao() {
		return stationDataDao;
	}

	public void setStationDataDao(IDataflowStationDAO stationDataDao) {
		this.stationDataDao = stationDataDao;
	}

	public IAreaApDAO getInfoAreaApDao() {
		return infoAreaApDao;
	}

	public void setInfoAreaApDao(IAreaApDAO infoAreaApDao) {
		this.infoAreaApDao = infoAreaApDao;
	}

	// getters and setters
	public IInfoACDAO getInfoDAO() {
		return infoDAO;
	}

	public void setInfoDAO(IInfoACDAO infoDAO) {
		this.infoDAO = infoDAO;
	}

	public IInfoFitapDAO getInfoApDao() {
		return infoApDao;
	}

	public void setInfoApDao(IInfoFitapDAO infoApDao) {
		this.infoApDao = infoApDao;
	}

	// getters and setters --end

}
