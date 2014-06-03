package aute.openapi.dao;

import java.util.List;

import aute.openapi.entities.TopoAreaap;
/**
 * TopoAreaap表的访问接口类
 * @author zhoushibao
 * @version 1.0
 * @since 2014-5-27 14:30:55
 *
 */
public interface ITopoAreaapDAo {

	// property constants
	public static final String AREA_ID = "areaId";
	public static final String LOCATION = "location";
	public static final String AD_URL = "adUrl";
	public static final String AD_INFO = "adInfo";

	void save(TopoAreaap transientInstance);

	void delete(TopoAreaap persistentInstance);

	TopoAreaap findById(java.lang.String id);

	List findByExample(TopoAreaap instance);

	List findByProperty(String propertyName, Object value);

	List findByAreaId(Object areaId);

	List findByLocation(Object location);

	List findByAdUrl(Object adUrl);

	List findByAdInfo(Object adInfo);

	List findAll();

	TopoAreaap merge(TopoAreaap detachedInstance);

	void attachDirty(TopoAreaap instance);

	void attachClean(TopoAreaap instance);

}