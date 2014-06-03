package aute.openapi.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import aute.openapi.dao.IInfoFitapDAO;
import aute.openapi.entities.InfoFitap;

/**
 * A data access object (DAO) providing persistence and search support for
 * InfoFitap entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see aute.openapi.entities.InfoFitap
 * @author MyEclipse Persistence Tools
 */

public class InfoFitapHibDAO extends BaseHibernateDAO implements IInfoFitapDAO {
	private static final Logger log = LoggerFactory
			.getLogger(InfoFitapHibDAO.class);
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#save(aute.openapi.entities.InfoFitap)
	 */
	public void save(InfoFitap transientInstance) {
		log.debug("saving InfoFitap instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#delete(aute.openapi.entities.InfoFitap)
	 */
	public void delete(InfoFitap persistentInstance) {
		log.debug("deleting InfoFitap instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findById(java.lang.String)
	 */
	public InfoFitap findById(java.lang.String id) {
		log.debug("getting InfoFitap instance with id: " + id);
		try {
			InfoFitap instance = (InfoFitap) getSession().get(
					"aute.openapi.entities.InfoFitap", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findByExample(aute.openapi.entities.InfoFitap)
	 */
	public List findByExample(InfoFitap instance) {
		log.debug("finding InfoFitap instance by example");
		try {
			List results = getSession()
					.createCriteria("aute.openapi.entities.InfoFitap")
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
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding InfoFitap instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from InfoFitap as model where model."
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
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findByDeviceName(java.lang.Object)
	 */
	public List findByDeviceName(Object deviceName) {
		return findByProperty(DEVICE_NAME, deviceName);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findBySn(java.lang.Object)
	 */
	public List findBySn(Object sn) {
		return findByProperty(SN, sn);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findByDeviceType(java.lang.Object)
	 */
	public List findByDeviceType(Object deviceType) {
		return findByProperty(DEVICE_TYPE, deviceType);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findByModel(java.lang.Object)
	 */
	public List findByModel(Object model) {
		return findByProperty(MODEL, model);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findByStatus(java.lang.Object)
	 */
	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findByLocation(java.lang.Object)
	 */
	public List findByLocation(Object location) {
		return findByProperty(LOCATION, location);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findByFactory(java.lang.Object)
	 */
	public List findByFactory(Object factory) {
		return findByProperty(FACTORY, factory);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findBySoftVersion(java.lang.Object)
	 */
	public List findBySoftVersion(Object softVersion) {
		return findByProperty(SOFT_VERSION, softVersion);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findByHardVersion(java.lang.Object)
	 */
	public List findByHardVersion(Object hardVersion) {
		return findByProperty(HARD_VERSION, hardVersion);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findByIp(java.lang.Object)
	 */
	public List findByIp(Object ip) {
		return findByProperty(IP, ip);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findByAcIp(java.lang.Object)
	 */
	public List findByAcIp(Object acIp) {
		return findByProperty(AC_IP, acIp);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findByAcMac(java.lang.Object)
	 */
	public List findByAcMac(Object acMac) {
		return findByProperty(AC_MAC, acMac);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findByWorkMode(java.lang.Object)
	 */
	public List findByWorkMode(Object workMode) {
		return findByProperty(WORK_MODE, workMode);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findBySubnetIp(java.lang.Object)
	 */
	public List findBySubnetIp(Object subnetIp) {
		return findByProperty(SUBNET_IP, subnetIp);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findByIdOnAc(java.lang.Object)
	 */
	public List findByIdOnAc(Object idOnAc) {
		return findByProperty(ID_ON_AC, idOnAc);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findByStartDuration(java.lang.Object)
	 */
	public List findByStartDuration(Object startDuration) {
		return findByProperty(START_DURATION, startDuration);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findByOnlineDuration(java.lang.Object)
	 */
	public List findByOnlineDuration(Object onlineDuration) {
		return findByProperty(ONLINE_DURATION, onlineDuration);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all InfoFitap instances");
		try {
			String queryString = "from InfoFitap";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#merge(aute.openapi.entities.InfoFitap)
	 */
	public InfoFitap merge(InfoFitap detachedInstance) {
		log.debug("merging InfoFitap instance");
		try {
			InfoFitap result = (InfoFitap) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#attachDirty(aute.openapi.entities.InfoFitap)
	 */
	public void attachDirty(InfoFitap instance) {
		log.debug("attaching dirty InfoFitap instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoFitapDAO#attachClean(aute.openapi.entities.InfoFitap)
	 */
	public void attachClean(InfoFitap instance) {
		log.debug("attaching clean InfoFitap instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}