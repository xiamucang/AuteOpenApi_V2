package aute.openapi.test;

import java.util.List;

import org.junit.Test;

import aute.openapi.dao.IAreaApDAO;
import aute.openapi.dao.IDataflowStationDAO;
import aute.openapi.dao.impl.AreaApHibDAO;
import aute.openapi.dao.impl.DataflowStationHibDAO;


public class TAreaInfo {
	
	@Test
	public void setUpBeforeClass(){
		IAreaApDAO infoAreaApDao = new AreaApHibDAO();
		List infoArea = infoAreaApDao.findAreaApInfo();
		System.out.println("获取地域信息成功，返回条数："+infoArea.size());
	}

	@Test
	public void testStationData(){
		IDataflowStationDAO stationDataDao = new DataflowStationHibDAO();
		List stationData = stationDataDao.findStationData("2013-05-28 12:15:53","2014-05-29 12:15:53");
		System.out.println("获取地域信息成功，返回条数："+stationData.size());
	}
}
