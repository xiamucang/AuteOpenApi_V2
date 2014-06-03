package aute.openapi.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import aute.openapi.dao.ITopoAreaapDAo;
import aute.openapi.entities.TopoAreaap;

/**
 * A data access object (DAO) providing persistence and search support for
 * TopoAreaap entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see aute.openapi.entities.TopoAreaap
 * @author MyEclipse Persistence Tools
 */

public class TopoAreaapHibDAO extends BaseHibernateDAO implements ITopoAreaapDAo {
	private static final Logger log = LoggerFactory
			.getLogger(TopoAreaapHibDAO.class);
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopoAreaapDAo#save(aute.openapi.entities.TopoAreaap)
	 */
	public void save(TopoAreaap transientInstance) {
		log.debug("saving TopoAreaap instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopoAreaapDAo#delete(aute.openapi.entities.TopoAreaap)
	 */
	public void delete(TopoAreaap persistentInstance) {
		log.debug("deleting TopoAreaap instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopoAreaapDAo#findById(java.lang.String)
	 */
	public TopoAreaap findById(java.lang.String id) {
		log.debug("getting TopoAreaap instance with id: " + id);
		try {
			TopoAreaap instance = (TopoAreaap) getSession().get(
					"aute.openapi.entities.TopoAreaap", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopoAreaapDAo#findByExample(aute.openapi.entities.TopoAreaap)
	 */
	public List findByExample(TopoAreaap instance) {
		log.debug("finding TopoAreaap instance by example");
		try {
			List results = getSession()
					.createCriteria("aute.openapi.entities.TopoAreaap")
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
	 * @see aute.openapi.dao.impl.ITopoAreaapDAo#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TopoAreaap instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TopoAreaap as model where model."
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
	 * @see aute.openapi.dao.impl.ITopoAreaapDAo#findByAreaId(java.lang.Object)
	 */
	public List findByAreaId(Object areaId) {
		return findByProperty(AREA_ID, areaId);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopoAreaapDAo#findByLocation(java.lang.Object)
	 */
	public List findByLocation(Object location) {
		return findByProperty(LOCATION, location);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopoAreaapDAo#findByAdUrl(java.lang.Object)
	 */
	public List findByAdUrl(Object adUrl) {
		return findByProperty(AD_URL, adUrl);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopoAreaapDAo#findByAdInfo(java.lang.Object)
	 */
	public List findByAdInfo(Object adInfo) {
		return findByProperty(AD_INFO, adInfo);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopoAreaapDAo#findAll()
	 */
	public List findAll() {
		log.debug("finding all TopoAreaap instances");
		try {
			String queryString = "from TopoAreaap";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopoAreaapDAo#merge(aute.openapi.entities.TopoAreaap)
	 */
	public TopoAreaap merge(TopoAreaap detachedInstance) {
		log.debug("merging TopoAreaap instance");
		try {
			TopoAreaap result = (TopoAreaap) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopoAreaapDAo#attachDirty(aute.openapi.entities.TopoAreaap)
	 */
	public void attachDirty(TopoAreaap instance) {
		log.debug("attaching dirty TopoAreaap instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.ITopoAreaapDAo#attachClean(aute.openapi.entities.TopoAreaap)
	 */
	public void attachClean(TopoAreaap instance) {
		log.debug("attaching clean TopoAreaap instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}