package aute.openapi.entities;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * InfoFitap entity. @author MyEclipse Persistence Tools
 */
@XmlRootElement(name="InfoAp")
public class InfoFitap implements java.io.Serializable {

	// Fields

	private String mac;
	private String deviceName;
	private String sn;
	private String deviceType;
	private String model;
	private String status;
	private String location;
	private String factory;
	private String softVersion;
	private String hardVersion;
	private String ip;
	private String acIp;
	private String acMac;
	private String workMode;
	private String subnetIp;
	private String idOnAc;
	private String startDuration;
	private String onlineDuration;

	// Constructors

	/** default constructor */
	public InfoFitap() {
	}

	/** minimal constructor */
	public InfoFitap(String mac) {
		this.mac = mac;
	}

	/** full constructor */
	public InfoFitap(String mac, String deviceName, String sn,
			String deviceType, String model, String status, String location,
			String factory, String softVersion, String hardVersion, String ip,
			String acIp, String acMac, String workMode, String subnetIp,
			String idOnAc, String startDuration, String onlineDuration) {
		this.mac = mac;
		this.deviceName = deviceName;
		this.sn = sn;
		this.deviceType = deviceType;
		this.model = model;
		this.status = status;
		this.location = location;
		this.factory = factory;
		this.softVersion = softVersion;
		this.hardVersion = hardVersion;
		this.ip = ip;
		this.acIp = acIp;
		this.acMac = acMac;
		this.workMode = workMode;
		this.subnetIp = subnetIp;
		this.idOnAc = idOnAc;
		this.startDuration = startDuration;
		this.onlineDuration = onlineDuration;
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

	public String getSn() {
		return this.sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getAcIp() {
		return this.acIp;
	}

	public void setAcIp(String acIp) {
		this.acIp = acIp;
	}

	public String getAcMac() {
		return this.acMac;
	}

	public void setAcMac(String acMac) {
		this.acMac = acMac;
	}

	public String getWorkMode() {
		return this.workMode;
	}

	public void setWorkMode(String workMode) {
		this.workMode = workMode;
	}

	public String getSubnetIp() {
		return this.subnetIp;
	}

	public void setSubnetIp(String subnetIp) {
		this.subnetIp = subnetIp;
	}

	public String getIdOnAc() {
		return this.idOnAc;
	}

	public void setIdOnAc(String idOnAc) {
		this.idOnAc = idOnAc;
	}

	public String getStartDuration() {
		return this.startDuration;
	}

	public void setStartDuration(String startDuration) {
		this.startDuration = startDuration;
	}

	public String getOnlineDuration() {
		return this.onlineDuration;
	}

	public void setOnlineDuration(String onlineDuration) {
		this.onlineDuration = onlineDuration;
	}

}