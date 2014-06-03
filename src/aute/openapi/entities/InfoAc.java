package aute.openapi.entities;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * InfoAc entity. @author MyEclipse Persistence Tools
 */
@XmlRootElement(name="InfoAc")
public class InfoAc implements java.io.Serializable {

	// Fields

	private String mac;
	private String deviceName;
	private String deviceSn;
	private String deviceType;
	private String model;
	private String location;
	private String factory;
	private String status;
	private String ip;
	private String otherIp;
	private String gateway;
	private String softVersion;
	private String hardVersion;
	private String apNum;
	private String alarmNum;
	private String isMainAc;
	private String updateTime;

	// Constructors

	/** default constructor */
	public InfoAc() {
	}

	/** minimal constructor */
	public InfoAc(String mac, String updateTime) {
		this.mac = mac;
		this.updateTime = updateTime;
	}

	/** full constructor */
	public InfoAc(String mac, String deviceName, String deviceSn,
			String deviceType, String model, String location, String factory,
			String status, String ip, String otherIp, String gateway,
			String softVersion, String hardVersion, String apNum,
			String alarmNum, String isMainAc, String updateTime) {
		this.mac = mac;
		this.deviceName = deviceName;
		this.deviceSn = deviceSn;
		this.deviceType = deviceType;
		this.model = model;
		this.location = location;
		this.factory = factory;
		this.status = status;
		this.ip = ip;
		this.otherIp = otherIp;
		this.gateway = gateway;
		this.softVersion = softVersion;
		this.hardVersion = hardVersion;
		this.apNum = apNum;
		this.alarmNum = alarmNum;
		this.isMainAc = isMainAc;
		this.updateTime = updateTime;
	}

	// Property accessors

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFactory() {
		return this.factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getOtherIp() {
		return this.otherIp;
	}

	public void setOtherIp(String otherIp) {
		this.otherIp = otherIp;
	}

	public String getGateway() {
		return this.gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}

	public String getSoftVersion() {
		return this.softVersion;
	}

	public void setSoftVersion(String softVersion) {
		this.softVersion = softVersion;
	}

	public String getHardVersion() {
		return this.hardVersion;
	}

	public void setHardVersion(String hardVersion) {
		this.hardVersion = hardVersion;
	}

	public String getApNum() {
		return this.apNum;
	}

	public void setApNum(String apNum) {
		this.apNum = apNum;
	}

	public String getAlarmNum() {
		return this.alarmNum;
	}

	public void setAlarmNum(String alarmNum) {
		this.alarmNum = alarmNum;
	}

	public String getIsMainAc() {
		return this.isMainAc;
	}

	public void setIsMainAc(String isMainAc) {
		this.isMainAc = isMainAc;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}