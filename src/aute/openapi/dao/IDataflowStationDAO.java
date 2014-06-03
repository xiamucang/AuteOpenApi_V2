package aute.openapi.dao;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import aute.openapi.entities.DataflowStation;

/**
 * dataflow_station表访问接口类
 * @author Cangxu
 *
 */

public interface IDataflowStationDAO {
	// property constants
	public static final String SRC_IP = "srcIp";
	public static final String DEST_IP = "destIp";
	public static final String SRC_PORT = "srcPort";
	public static final String DEST_PORT = "destPort";
	public static final String PROTOCOL = "protocol";
	public static final String STATION_MAC = "stationMac";
	public static final String DATA_FLOW = "dataFlow";
	public static final String DURATION = "duration";
	
	public void save(DataflowStation transientInstance);

	public void delete(DataflowStation persistentInstance);

	public DataflowStation findById(java.lang.Integer id);

	public List findByExample(DataflowStation instance);

	public List findByProperty(String propertyName, Object value);

	public List findBySrcIp(Object srcIp);

	public List findByDestIp(Object destIp);

	public List findBySrcPort(Object srcPort);

	public List findByDestPort(Object destPort);

	public List findByProtocol(Object protocol);

	public List findByStationMac(Object stationMac);

	public List findByDataFlow(Object dataFlow);

	public List findByDuration(Object duration);

	public List findAll();

	public DataflowStation merge(DataflowStation detachedInstance);

	public void attachDirty(DataflowStation instance);

	public void attachClean(DataflowStation instance);
	
	public List findStationData(String startTime,String endTime);
}
