package aute.openapi.dao;

import java.util.List;

import aute.openapi.entities.InfoStation;
/**
 * InfoStation表的访问接口类
 * @author zhoushibao
 * @version 1.0
 * @since 2014-5-27 14:30:55
 *
 */
public interface IInfoStationDAO {

	// property constants
	public static final String COLL_TIME = "collTime";
	public static final String AP_MAC = "apMac";
	public static final String WTP_BELONG_AP_ID = "wtpBelongApId";
	public static final String AC_IP = "acIp";
	public static final String STA_IP = "staIp";
	public static final String SSID = "ssid";
	public static final String STA_RADIO_MODE = "staRadioMode";
	public static final String STA_RADIO_CHANNEL = "staRadioChannel";
	public static final String STA_VLAN_ID = "staVlanId";
	public static final String ACCESS_TIME = "accessTime";
	public static final String ONLINE_TIME = "onlineTime";
	public static final String STA_SIGNAL_STRENGT = "staSignalStrengt";
	public static final String SNR = "snr";
	public static final String STA_SEND_BYTE = "staSendByte";
	public static final String STA_RECE_BYTE = "staReceByte";
	public static final String STA_SEND_PACK = "staSendPack";
	public static final String STA_RECE_PACK = "staRecePack";
	public static final String STA_REP_SEND_PACK = "staRepSendPack";
	public static final String STA_REP_SEND_BYTE = "staRepSendByte";
	public static final String STA_SEND_SPEED = "staSendSpeed";
	public static final String STA_RECE_SPEED = "staReceSpeed";
	public static final String STA_ALL_THROUGHPUT = "staAllThroughput";
	public static final String STA_TYPE = "staType";
	public static final String DEVICE_MANUFACTURER = "deviceManufacturer";
	public static final String DEVICE_MODEL = "deviceModel";
	public static final String OS_VERSION = "osVersion";

	void save(InfoStation transientInstance);

	void delete(InfoStation persistentInstance);

	InfoStation findById(java.lang.String id);

	List findByExample(InfoStation instance);

	List findByProperty(String propertyName, Object value);

	List findByCollTime(Object collTime);

	List findByApMac(Object apMac);

	List findByWtpBelongApId(Object wtpBelongApId);

	List findByAcIp(Object acIp);

	List findByStaIp(Object staIp);

	List findBySsid(Object ssid);

	List findByStaRadioMode(Object staRadioMode);

	List findByStaRadioChannel(Object staRadioChannel);

	List findByStaVlanId(Object staVlanId);

	List findByAccessTime(Object accessTime);

	List findByOnlineTime(Object onlineTime);

	List findByStaSignalStrengt(Object staSignalStrengt);

	List findBySnr(Object snr);

	List findByStaSendByte(Object staSendByte);

	List findByStaReceByte(Object staReceByte);

	List findByStaSendPack(Object staSendPack);

	List findByStaRecePack(Object staRecePack);

	List findByStaRepSendPack(Object staRepSendPack);

	List findByStaRepSendByte(Object staRepSendByte);

	List findByStaSendSpeed(Object staSendSpeed);

	List findByStaReceSpeed(Object staReceSpeed);

	List findByStaAllThroughput(Object staAllThroughput);

	List findByStaType(Object staType);

	List findByDeviceManufacturer(Object deviceManufacturer);

	List findByDeviceModel(Object deviceModel);

	List findByOsVersion(Object osVersion);

	List findAll();

	InfoStation merge(InfoStation detachedInstance);

	void attachDirty(InfoStation instance);

	void attachClean(InfoStation instance);

}