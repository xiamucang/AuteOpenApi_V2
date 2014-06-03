package aute.openapi.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import aute.openapi.dao.ITopoAreaDAO;
import aute.openapi.entities.TopoArea;

/**
 * A data access object (DAO) providing persistence and search support for
 * TopoArea entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see aute.openapi.entities.TopoArea
 * @author MyEclipse Persistence Tools
 */

public class TopoAreaHibDAO extends BaseHibernateDAO implements ITopoAreaDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TopoAreaHibDAO.class);
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#save(aute.openapi.entities.TopoArea)
	 */
	public void save(TopoArea transientInstance) {
		log.debug("saving TopoArea instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#delete(aute.openapi.entities.TopoArea)
	 */
	public void delete(TopoArea persistentInstance) {
		log.debug("deleting TopoArea instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#findById(java.lang.Integer)
	 */
	public TopoArea findById(java.lang.Integer id) {
		log.debug("getting TopoArea instance with id: " + id);
		try {
			TopoArea instance = (TopoArea) getSession().get(
					"aute.openapi.entities.TopoArea", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#findByExample(aute.openapi.entities.TopoArea)
	 */
	public List findByExample(TopoArea instance) {
		log.debug("finding TopoArea instance by example");
		try {
			List results = getSession()
					.createCriteria("aute.openapi.entities.TopoArea")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TopoArea instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TopoArea as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#findByPath(java.lang.Object)
	 */
	public List findByPath(Object path) {
		return findByProperty(PATH, path);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#findByDistrictName(java.lang.Object)
	 */
	public List findByDistrictName(Object districtName) {
		return findByProperty(DISTRICT_NAME, districtName);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#findByParentId(java.lang.Object)
	 */
	public List findByParentId(Object parentId) {
		return findByProperty(PARENT_ID, parentId);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#findByLevel(java.lang.Object)
	 */
	public List findByLevel(Object level) {
		return findByProperty(LEVEL, level);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#findByLocation(java.lang.Object)
	 */
	public List findByLocation(Object location) {
		return findByProperty(LOCATION, location);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#findByNasid(java.lang.Object)
	 */
	public List findByNasid(Object nasid) {
		return findByProperty(NASID, nasid);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#findByIteminfo(java.lang.Object)
	 */
	public List findByIteminfo(Object iteminfo) {
		return findByProperty(ITEMINFO, iteminfo);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#findByRegion(java.lang.Object)
	 */
	public List findByRegion(Object region) {
		return findByProperty(REGION, region);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#findByCoverage(java.lang.Object)
	 */
	public List findByCoverage(Object coverage) {
		return findByProperty(COVERAGE, coverage);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#findByFullName(java.lang.Object)
	 */
	public List findByFullName(Object fullName) {
		return findByProperty(FULL_NAME, fullName);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#findAll()
	 */
	public List findAll() {
		log.debug("finding all TopoArea instances");
		try {
			String queryString = "from TopoArea";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#merge(aute.openapi.entities.TopoArea)
	 */
	public TopoArea merge(TopoArea detachedInstance) {
		log.debug("merging TopoArea instance");
		try {
			TopoArea result = (TopoArea) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#attachDirty(aute.openapi.entities.TopoArea)
	 */
	public void attachDirty(TopoArea instance) {
		log.debug("attaching dirty TopoArea instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopo#attachClean(aute.openapi.entities.TopoArea)
	 */
	public void attachClean(TopoArea instance) {
		log.debug("attaching clean TopoArea instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}