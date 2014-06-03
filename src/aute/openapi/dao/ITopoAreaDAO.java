package aute.openapi.dao;

import java.util.List;

import aute.openapi.entities.TopoArea;
/**
 * TopoArea表的访问接口类
 * @author zhoushibao
 * @version 1.0
 * @since 2014-5-27 14:30:55
 *
 */
public interface ITopoAreaDAO {

	// property constants
	public static final String PATH = "path";
	public static final String DISTRICT_NAME = "districtName";
	public static final String PARENT_ID = "parentId";
	public static final String LEVEL = "level";
	public static final String LOCATION = "location";
	public static final String NASID = "nasid";
	public static final String ITEMINFO = "iteminfo";
	public static final String REGION = "region";
	public static final String COVERAGE = "coverage";
	public static final String FULL_NAME = "fullName";

	void save(TopoArea transientInstance);

	void delete(TopoArea persistentInstance);

	TopoArea findById(java.lang.Integer id);

	List findByExample(TopoArea instance);

	List findByProperty(String propertyName, Object value);

	List findByPath(Object path);

	List findByDistrictName(Object districtName);

	List findByParentId(Object parentId);

	List findByLevel(Object level);

	List findByLocation(Object location);

	List findByNasid(Object nasid);

	List findByIteminfo(Object iteminfo);

	List findByRegion(Object region);

	List findByCoverage(Object coverage);

	List findByFullName(Object fullName);

	List findAll();

	TopoArea merge(TopoArea detachedInstance);

	void attachDirty(TopoArea instance);

	void attachClean(TopoArea instance);

}