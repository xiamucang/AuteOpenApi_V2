package aute.openapi.entities;

/**
 * TopoArea entity. @author MyEclipse Persistence Tools
 */

public class TopoArea implements java.io.Serializable {

	// Fields

	private Integer id;
	private String path;
	private String districtName;
	private Integer parentId;
	private Integer level;
	private String location;
	private String nasid;
	private String iteminfo;
	private String region;
	private String coverage;
	private String fullName;

	// Constructors

	/** default constructor */
	public TopoArea() {
	}

	/** minimal constructor */
	public TopoArea(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TopoArea(Integer id, String path, String districtName,
			Integer parentId, Integer level, String location, String nasid,
			String iteminfo, String region, String coverage, String fullName) {
		this.id = id;
		this.path = path;
		this.districtName = districtName;
		this.parentId = parentId;
		this.level = level;
		this.location = location;
		this.nasid = nasid;
		this.iteminfo = iteminfo;
		this.region = region;
		this.coverage = coverage;
		this.fullName = fullName;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNasid() {
		return this.nasid;
	}

	public void setNasid(String nasid) {
		this.nasid = nasid;
	}

	public String getIteminfo() {
		return this.iteminfo;
	}

	public void setIteminfo(String iteminfo) {
		this.iteminfo = iteminfo;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCoverage() {
		return this.coverage;
	}

	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}