package aute.openapi.dao.impl;

import java.util.ArrayList;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import aute.openapi.dao.IInfoACDAO;
import aute.openapi.entities.InfoAc;

/**
 * A data access object (DAO) providing persistence and search support for
 * InfoAc entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see aute.openapi.entities.InfoAc
 * @author MyEclipse Persistence Tools
 */
public class InfoAcHibDAO extends BaseHibernateDAO implements IInfoACDAO {
	private static final Logger log = LoggerFactory.getLogger(InfoAcHibDAO.class);
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#save(aute.openapi.entities.InfoAc)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#save(aute.openapi.entities.InfoAc)
	 */
	public void save(InfoAc transientInstance) {
		log.debug("saving InfoAc instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#delete(aute.openapi.entities.InfoAc)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#delete(aute.openapi.entities.InfoAc)
	 */
	public void delete(InfoAc persistentInstance) {
		log.debug("deleting InfoAc instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findById(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findById(java.lang.String)
	 */
	public InfoAc findById(java.lang.String id) {
		log.debug("getting InfoAc instance with id: " + id);
		try {
			InfoAc instance = (InfoAc) getSession().get(
					"aute.openapi.entities.InfoAc", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByExample(aute.openapi.entities.InfoAc)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findByExample(aute.openapi.entities.InfoAc)
	 */
	public ArrayList<InfoAc> findByExample(InfoAc instance) {
		log.debug("finding InfoAc instance by example");
		try {
			ArrayList<InfoAc> results = (ArrayList<InfoAc>) getSession()
					.createCriteria("aute.openapi.entities.InfoAc")
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
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findByProperty(java.lang.String, java.lang.Object)
	 */
	public ArrayList<InfoAc> findByProperty(String propertyName, Object value) {
		log.debug("finding InfoAc instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from InfoAc as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return (ArrayList<InfoAc>) queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByDeviceName(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findByDeviceName(java.lang.Object)
	 */
	public ArrayList<InfoAc> findByDeviceName(Object deviceName) {
		return findByProperty(DEVICE_NAME, deviceName);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByDeviceSn(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findByDeviceSn(java.lang.Object)
	 */
	public ArrayList<InfoAc> findByDeviceSn(Object deviceSn) {
		return findByProperty(DEVICE_SN, deviceSn);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByDeviceType(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findByDeviceType(java.lang.Object)
	 */
	public ArrayList<InfoAc> findByDeviceType(Object deviceType) {
		return findByProperty(DEVICE_TYPE, deviceType);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByModel(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findByModel(java.lang.Object)
	 */
	public ArrayList<InfoAc> findByModel(Object model) {
		return findByProperty(MODEL, model);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByLocation(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findByLocation(java.lang.Object)
	 */
	public ArrayList<InfoAc> findByLocation(Object location) {
		return findByProperty(LOCATION, location);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByFactory(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findByFactory(java.lang.Object)
	 */
	public ArrayList<InfoAc> findByFactory(Object factory) {
		return findByProperty(FACTORY, factory);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByStatus(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findByStatus(java.lang.Object)
	 */
	public ArrayList<InfoAc> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByIp(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findByIp(java.lang.Object)
	 */
	public ArrayList<InfoAc> findByIp(Object ip) {
		return findByProperty(IP, ip);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByOtherIp(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findByOtherIp(java.lang.Object)
	 */
	public ArrayList<InfoAc> findByOtherIp(Object otherIp) {
		return findByProperty(OTHER_IP, otherIp);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByGateway(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findByGateway(java.lang.Object)
	 */
	public ArrayList<InfoAc> findByGateway(Object gateway) {
		return findByProperty(GATEWAY, gateway);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findBySoftVersion(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findBySoftVersion(java.lang.Object)
	 */
	public ArrayList<InfoAc> findBySoftVersion(Object softVersion) {
		return findByProperty(SOFT_VERSION, softVersion);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByHardVersion(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findByHardVersion(java.lang.Object)
	 */
	public ArrayList<InfoAc> findByHardVersion(Object hardVersion) {
		return findByProperty(HARD_VERSION, hardVersion);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByApNum(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findByApNum(java.lang.Object)
	 */
	public ArrayList<InfoAc> findByApNum(Object apNum) {
		return findByProperty(AP_NUM, apNum);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByAlarmNum(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findByAlarmNum(java.lang.Object)
	 */
	public ArrayList<InfoAc> findByAlarmNum(Object alarmNum) {
		return findByProperty(ALARM_NUM, alarmNum);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findByIsMainAc(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findByIsMainAc(java.lang.Object)
	 */
	public ArrayList<InfoAc> findByIsMainAc(Object isMainAc) {
		return findByProperty(IS_MAIN_AC, isMainAc);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#findAll()
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#findAll()
	 */
	public ArrayList<InfoAc> findAll() {
		log.debug("finding all InfoAc instances");
		try {
			String queryString = "from InfoAc";
			Query queryObject = getSession().createQuery(queryString);
			return (ArrayList<InfoAc>) queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#merge(aute.openapi.entities.InfoAc)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#merge(aute.openapi.entities.InfoAc)
	 */
	public InfoAc merge(InfoAc detachedInstance) {
		log.debug("merging InfoAc instance");
		try {
			InfoAc result = (InfoAc) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#attachDirty(aute.openapi.entities.InfoAc)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#attachDirty(aute.openapi.entities.InfoAc)
	 */
	public void attachDirty(InfoAc instance) {
		log.debug("attaching dirty InfoAc instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoACDAO#attachClean(aute.openapi.entities.InfoAc)
	 */
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoAC#attachClean(aute.openapi.entities.InfoAc)
	 */
	public void attachClean(InfoAc instance) {
		log.debug("attaching clean InfoAc instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}