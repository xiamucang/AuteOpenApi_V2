package aute.openapi.entities;

import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * DataflowStation entity. @author MyEclipse Persistence Tools
 */
@XmlRootElement(name = "StationData")
public class DataflowStation implements java.io.Serializable {

	// Fields

	private Integer id;
	private String collTime;
	private String srcIp;
	private String destIp;
	private Integer srcPort;
	private Integer destPort;
	private String protocol;
	private String stationMac;
	private Long dataFlow;
	private Long duration;

	// Constructors

	/** default constructor */
	public DataflowStation() {
	}

	/** minimal constructor */
	public DataflowStation(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public DataflowStation(Integer id, String collTime, String srcIp,
			String destIp, Integer srcPort, Integer destPort, String protocol,
			String stationMac, Long dataFlow, Long duration) {
		this.id = id;
		this.collTime = collTime;
		this.srcIp = srcIp;
		this.destIp = destIp;
		this.srcPort = srcPort;
		this.destPort = destPort;
		this.protocol = protocol;
		this.stationMac = stationMac;
		this.dataFlow = dataFlow;
		this.duration = duration;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCollTime() {
		return this.collTime;
	}

	public void setCollTime(String collTime) {
		this.collTime = collTime;
	}

	public String getSrcIp() {
		return this.srcIp;
	}

	public void setSrcIp(String srcIp) {
		this.srcIp = srcIp;
	}

	public String getDestIp() {
		return this.destIp;
	}

	public void setDestIp(String destIp) {
		this.destIp = destIp;
	}

	public Integer getSrcPort() {
		return this.srcPort;
	}

	public void setSrcPort(Integer srcPort) {
		this.srcPort = srcPort;
	}

	public Integer getDestPort() {
		return this.destPort;
	}

	public void setDestPort(Integer destPort) {
		this.destPort = destPort;
	}

	public String getProtocol() {
		return this.protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getStationMac() {
		return this.stationMac;
	}

	public void setStationMac(String stationMac) {
		this.stationMac = stationMac;
	}

	public Long getDataFlow() {
		return this.dataFlow;
	}

	public void setDataFlow(Long dataFlow) {
		this.dataFlow = dataFlow;
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

}