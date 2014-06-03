package aute.openapi.dao;

import java.util.List;

import aute.openapi.entities.InfoFitap;
/**
 * InfoFitap表的访问接口类
 * @author zhoushibao
 * @version 1.0
 * @since 2014-5-27 14:30:55
 *
 */
public interface IInfoFitapDAO {

	// property constants
	public static final String DEVICE_NAME = "deviceName";
	public static final String SN = "sn";
	public static final String DEVICE_TYPE = "deviceType";
	public static final String MODEL = "model";
	public static final String STATUS = "status";
	public static final String LOCATION = "location";
	public static final String FACTORY = "factory";
	public static final String SOFT_VERSION = "softVersion";
	public static final String HARD_VERSION = "hardVersion";
	public static final String IP = "ip";
	public static final String AC_IP = "acIp";
	public static final String AC_MAC = "acMac";
	public static final String WORK_MODE = "workMode";
	public static final String SUBNET_IP = "subnetIp";
	public static final String ID_ON_AC = "idOnAc";
	public static final String START_DURATION = "startDuration";
	public static final String ONLINE_DURATION = "onlineDuration";

	void save(InfoFitap transientInstance);

	void delete(InfoFitap persistentInstance);

	InfoFitap findById(java.lang.String id);

	List findByExample(InfoFitap instance);

	List findByProperty(String propertyName, Object value);

	List findByDeviceName(Object deviceName);

	List findBySn(Object sn);

	List findByDeviceType(Object deviceType);

	List findByModel(Object model);

	List findByStatus(Object status);

	List findByLocation(Object location);

	List findByFactory(Object factory);

	List findBySoftVersion(Object softVersion);

	List findByHardVersion(Object hardVersion);

	List findByIp(Object ip);

	List findByAcIp(Object acIp);

	List findByAcMac(Object acMac);

	List findByWorkMode(Object workMode);

	List findBySubnetIp(Object subnetIp);

	List findByIdOnAc(Object idOnAc);

	List findByStartDuration(Object startDuration);

	List findByOnlineDuration(Object onlineDuration);

	List findAll();

	InfoFitap merge(InfoFitap detachedInstance);

	void attachDirty(InfoFitap instance);

	void attachClean(InfoFitap instance);

}