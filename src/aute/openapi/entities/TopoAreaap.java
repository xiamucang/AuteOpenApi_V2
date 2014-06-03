package aute.openapi.entities;

/**
 * TopoAreaap entity. @author MyEclipse Persistence Tools
 */

public class TopoAreaap implements java.io.Serializable {

	// Fields

	private String apMac;
	private Integer areaId;
	private String location;
	private String adUrl;
	private String adInfo;

	// Constructors

	/** default constructor */
	public TopoAreaap() {
	}

	/** minimal constructor */
	public TopoAreaap(String apMac) {
		this.apMac = apMac;
	}

	/** full constructor */
	public TopoAreaap(String apMac, Integer areaId, String location,
			String adUrl, String adInfo) {
		this.apMac = apMac;
		this.areaId = areaId;
		this.location = location;
		this.adUrl = adUrl;
		this.adInfo = adInfo;
	}

	// Property accessors

	public String getApMac() {
		return this.apMac;
	}

	public void setApMac(String apMac) {
		this.apMac = apMac;
	}

	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAdUrl() {
		return this.adUrl;
	}

	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl;
	}

	public String getAdInfo() {
		return this.adInfo;
	}

	public void setAdInfo(String adInfo) {
		this.adInfo = adInfo;
	}

}