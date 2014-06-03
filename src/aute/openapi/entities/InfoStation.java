package aute.openapi.entities;

/**
 * InfoStation entity. @author MyEclipse Persistence Tools
 */

public class InfoStation implements java.io.Serializable {

	// Fields

	private String mac;
	private String collTime;
	private String apMac;
	private String wtpBelongApId;
	private String acIp;
	private String staIp;
	private String ssid;
	private String staRadioMode;
	private String staRadioChannel;
	private String staVlanId;
	private String accessTime;
	private String onlineTime;
	private String staSignalStrengt;
	private String snr;
	private String staSendByte;
	private String staReceByte;
	private String staSendPack;
	private String staRecePack;
	private String staRepSendPack;
	private String staRepSendByte;
	private String staSendSpeed;
	private String staReceSpeed;
	private String staAllThroughput;
	private String staType;
	private String deviceManufacturer;
	private String deviceModel;
	private String osVersion;

	// Constructors

	/** default constructor */
	public InfoStation() {
	}

	/** minimal constructor */
	public InfoStation(String mac) {
		this.mac = mac;
	}

	/** full constructor */
	public InfoStation(String mac, String collTime, String apMac,
			String wtpBelongApId, String acIp, String staIp, String ssid,
			String staRadioMode, String staRadioChannel, String staVlanId,
			String accessTime, String onlineTime, String staSignalStrengt,
			String snr, String staSendByte, String staReceByte,
			String staSendPack, String staRecePack, String staRepSendPack,
			String staRepSendByte, String staSendSpeed, String staReceSpeed,
			String staAllThroughput, String staType, String deviceManufacturer,
			String deviceModel, String osVersion) {
		this.mac = mac;
		this.collTime = collTime;
		this.apMac = apMac;
		this.wtpBelongApId = wtpBelongApId;
		this.acIp = acIp;
		this.staIp = staIp;
		this.ssid = ssid;
		this.staRadioMode = staRadioMode;
		this.staRadioChannel = staRadioChannel;
		this.staVlanId = staVlanId;
		this.accessTime = accessTime;
		this.onlineTime = onlineTime;
		this.staSignalStrengt = staSignalStrengt;
		this.snr = snr;
		this.staSendByte = staSendByte;
		this.staReceByte = staReceByte;
		this.staSendPack = staSendPack;
		this.staRecePack = staRecePack;
		this.staRepSendPack = staRepSendPack;
		this.staRepSendByte = staRepSendByte;
		this.staSendSpeed = staSendSpeed;
		this.staReceSpeed = staReceSpeed;
		this.staAllThroughput = staAllThroughput;
		this.staType = staType;
		this.deviceManufacturer = deviceManufacturer;
		this.deviceModel = deviceModel;
		this.osVersion = osVersion;
	}

	// Property accessors

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getCollTime() {
		return this.collTime;
	}

	public void setCollTime(String collTime) {
		this.collTime = collTime;
	}

	public String getApMac() {
		return this.apMac;
	}

	public void setApMac(String apMac) {
		this.apMac = apMac;
	}

	public String getWtpBelongApId() {
		return this.wtpBelongApId;
	}

	public void setWtpBelongApId(String wtpBelongApId) {
		this.wtpBelongApId = wtpBelongApId;
	}

	public String getAcIp() {
		return this.acIp;
	}

	public void setAcIp(String acIp) {
		this.acIp = acIp;
	}

	public String getStaIp() {
		return this.staIp;
	}

	public void setStaIp(String staIp) {
		this.staIp = staIp;
	}

	public String getSsid() {
		return this.ssid;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
	}

	public String getStaRadioMode() {
		return this.staRadioMode;
	}

	public void setStaRadioMode(String staRadioMode) {
		this.staRadioMode = staRadioMode;
	}

	public String getStaRadioChannel() {
		return this.staRadioChannel;
	}

	public void setStaRadioChannel(String staRadioChannel) {
		this.staRadioChannel = staRadioChannel;
	}

	public String getStaVlanId() {
		return this.staVlanId;
	}

	public void setStaVlanId(String staVlanId) {
		this.staVlanId = staVlanId;
	}

	public String getAccessTime() {
		return this.accessTime;
	}

	public void setAccessTime(String accessTime) {
		this.accessTime = accessTime;
	}

	public String getOnlineTime() {
		return this.onlineTime;
	}

	public void setOnlineTime(String onlineTime) {
		this.onlineTime = onlineTime;
	}

	public String getStaSignalStrengt() {
		return this.staSignalStrengt;
	}

	public void setStaSignalStrengt(String staSignalStrengt) {
		this.staSignalStrengt = staSignalStrengt;
	}

	public String getSnr() {
		return this.snr;
	}

	public void setSnr(String snr) {
		this.snr = snr;
	}

	public String getStaSendByte() {
		return this.staSendByte;
	}

	public void setStaSendByte(String staSendByte) {
		this.staSendByte = staSendByte;
	}

	public String getStaReceByte() {
		return this.staReceByte;
	}

	public void setStaReceByte(String staReceByte) {
		this.staReceByte = staReceByte;
	}

	public String getStaSendPack() {
		return this.staSendPack;
	}

	public void setStaSendPack(String staSendPack) {
		this.staSendPack = staSendPack;
	}

	public String getStaRecePack() {
		return this.staRecePack;
	}

	public void setStaRecePack(String staRecePack) {
		this.staRecePack = staRecePack;
	}

	public String getStaRepSendPack() {
		return this.staRepSendPack;
	}

	public void setStaRepSendPack(String staRepSendPack) {
		this.staRepSendPack = staRepSendPack;
	}

	public String getStaRepSendByte() {
		return this.staRepSendByte;
	}

	public void setStaRepSendByte(String staRepSendByte) {
		this.staRepSendByte = staRepSendByte;
	}

	public String getStaSendSpeed() {
		return this.staSendSpeed;
	}

	public void setStaSendSpeed(String staSendSpeed) {
		this.staSendSpeed = staSendSpeed;
	}

	public String getStaReceSpeed() {
		return this.staReceSpeed;
	}

	public void setStaReceSpeed(String staReceSpeed) {
		this.staReceSpeed = staReceSpeed;
	}

	public String getStaAllThroughput() {
		return this.staAllThroughput;
	}

	public void setStaAllThroughput(String staAllThroughput) {
		this.staAllThroughput = staAllThroughput;
	}

	public String getStaType() {
		return this.staType;
	}

	public void setStaType(String staType) {
		this.staType = staType;
	}

	public String getDeviceManufacturer() {
		return this.deviceManufacturer;
	}

	public void setDeviceManufacturer(String deviceManufacturer) {
		this.deviceManufacturer = deviceManufacturer;
	}

	public String getDeviceModel() {
		return this.deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public String getOsVersion() {
		return this.osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

}