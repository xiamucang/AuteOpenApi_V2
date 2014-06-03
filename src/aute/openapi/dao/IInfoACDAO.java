package aute.openapi.dao;

import java.util.List;

import aute.openapi.entities.InfoAc;
/**
 * infoac表的访问接口类
 * @author zhoushibao
 * @version 1.0
 * @since 2014-5-27 14:30:55
 *
 */
public interface IInfoACDAO {

	// property constants
	public static final String DEVICE_NAME = "deviceName";
	public static final String DEVICE_SN = "deviceSn";
	public static final String DEVICE_TYPE = "deviceType";
	public static final String MODEL = "model";
	public static final String LOCATION = "location";
	public static final String FACTORY = "factory";
	public static final String STATUS = "status";
	public static final String IP = "ip";
	public static final String OTHER_IP = "otherIp";
	public static final String GATEWAY = "gateway";
	public static final String SOFT_VERSION = "softVersion";
	public static final String HARD_VERSION = "hardVersion";
	public static final String AP_NUM = "apNum";
	public static final String ALARM_NUM = "alarmNum";
	public static final String IS_MAIN_AC = "isMainAc";

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#save(aute.openapi.entities.InfoAc)
	 */
	void save(InfoAc transientInstance);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#delete(aute.openapi.entities.InfoAc)
	 */
	void delete(InfoAc persistentInstance);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findById(java.lang.String)
	 */
	InfoAc findById(java.lang.String id);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByExample(aute.openapi.entities.InfoAc)
	 */
	List findByExample(InfoAc instance);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	List findByProperty(String propertyName, Object value);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByDeviceName(java.lang.Object)
	 */
	List findByDeviceName(Object deviceName);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByDeviceSn(java.lang.Object)
	 */
	List findByDeviceSn(Object deviceSn);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByDeviceType(java.lang.Object)
	 */
	List findByDeviceType(Object deviceType);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByModel(java.lang.Object)
	 */
	List findByModel(Object model);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByLocation(java.lang.Object)
	 */
	List findByLocation(Object location);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByFactory(java.lang.Object)
	 */
	List findByFactory(Object factory);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByStatus(java.lang.Object)
	 */
	List findByStatus(Object status);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByIp(java.lang.Object)
	 */
	List findByIp(Object ip);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByOtherIp(java.lang.Object)
	 */
	List findByOtherIp(Object otherIp);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByGateway(java.lang.Object)
	 */
	List findByGateway(Object gateway);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findBySoftVersion(java.lang.Object)
	 */
	List findBySoftVersion(Object softVersion);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByHardVersion(java.lang.Object)
	 */
	List findByHardVersion(Object hardVersion);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByApNum(java.lang.Object)
	 */
	List findByApNum(Object apNum);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByAlarmNum(java.lang.Object)
	 */
	List findByAlarmNum(Object alarmNum);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByIsMainAc(java.lang.Object)
	 */
	List findByIsMainAc(Object isMainAc);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findAll()
	 */
	List findAll();

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#merge(aute.openapi.entities.InfoAc)
	 */
	InfoAc merge(InfoAc detachedInstance);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#attachDirty(aute.openapi.entities.InfoAc)
	 */
	void attachDirty(InfoAc instance);

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#attachClean(aute.openapi.entities.InfoAc)
	 */
	void attachClean(InfoAc instance);

}