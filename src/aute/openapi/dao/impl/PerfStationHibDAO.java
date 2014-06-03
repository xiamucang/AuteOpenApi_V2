package aute.openapi.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import aute.openapi.dao.IPerfStationDAO;
import aute.openapi.entities.PerfStation;

/**
 * A data access object (DAO) providing persistence and search support for
 * PerfStation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see aute.openapi.entities.PerfStation
 * @author MyEclipse Persistence Tools
 */

public class PerfStationHibDAO extends BaseHibernateDAO implements IPerfStationDAO {
	private static final Logger log = LoggerFactory
			.getLogger(PerfStationHibDAO.class);
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#save(aute.openapi.entities.PerfStation)
	 */
	public void save(PerfStation transientInstance) {
		log.debug("saving PerfStation instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#delete(aute.openapi.entities.PerfStation)
	 */
	public void delete(PerfStation persistentInstance) {
		log.debug("deleting PerfStation instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findById(java.lang.Integer)
	 */
	public PerfStation findById(java.lang.Integer id) {
		log.debug("getting PerfStation instance with id: " + id);
		try {
			PerfStation instance = (PerfStation) getSession().get(
					"aute.openapi.entities.PerfStation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByExample(aute.openapi.entities.PerfStation)
	 */
	public List findByExample(PerfStation instance) {
		log.debug("finding PerfStation instance by example");
		try {
			List results = getSession()
					.createCriteria("aute.openapi.entities.PerfStation")
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
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PerfStation instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PerfStation as model where model."
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
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByMac(java.lang.Object)
	 */
	public List findByMac(Object mac) {
		return findByProperty(MAC, mac);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByApMac(java.lang.Object)
	 */
	public List findByApMac(Object apMac) {
		return findByProperty(AP_MAC, apMac);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByWtpBelongApId(java.lang.Object)
	 */
	public List findByWtpBelongApId(Object wtpBelongApId) {
		return findByProperty(WTP_BELONG_AP_ID, wtpBelongApId);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByAcIp(java.lang.Object)
	 */
	public List findByAcIp(Object acIp) {
		return findByProperty(AC_IP, acIp);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByStaIp(java.lang.Object)
	 */
	public List findByStaIp(Object staIp) {
		return findByProperty(STA_IP, staIp);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findBySsid(java.lang.Object)
	 */
	public List findBySsid(Object ssid) {
		return findByProperty(SSID, ssid);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByStaRadioMode(java.lang.Object)
	 */
	public List findByStaRadioMode(Object staRadioMode) {
		return findByProperty(STA_RADIO_MODE, staRadioMode);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByStaRadioChannel(java.lang.Object)
	 */
	public List findByStaRadioChannel(Object staRadioChannel) {
		return findByProperty(STA_RADIO_CHANNEL, staRadioChannel);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByStaVlanId(java.lang.Object)
	 */
	public List findByStaVlanId(Object staVlanId) {
		return findByProperty(STA_VLAN_ID, staVlanId);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByAccessTime(java.lang.Object)
	 */
	public List findByAccessTime(Object accessTime) {
		return findByProperty(ACCESS_TIME, accessTime);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByOnlineTime(java.lang.Object)
	 */
	public List findByOnlineTime(Object onlineTime) {
		return findByProperty(ONLINE_TIME, onlineTime);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByStaSignalStrengt(java.lang.Object)
	 */
	public List findByStaSignalStrengt(Object staSignalStrengt) {
		return findByProperty(STA_SIGNAL_STRENGT, staSignalStrengt);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findBySnr(java.lang.Object)
	 */
	public List findBySnr(Object snr) {
		return findByProperty(SNR, snr);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByStaSendByte(java.lang.Object)
	 */
	public List findByStaSendByte(Object staSendByte) {
		return findByProperty(STA_SEND_BYTE, staSendByte);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByStaReceByte(java.lang.Object)
	 */
	public List findByStaReceByte(Object staReceByte) {
		return findByProperty(STA_RECE_BYTE, staReceByte);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByStaSendPack(java.lang.Object)
	 */
	public List findByStaSendPack(Object staSendPack) {
		return findByProperty(STA_SEND_PACK, staSendPack);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByStaRecePack(java.lang.Object)
	 */
	public List findByStaRecePack(Object staRecePack) {
		return findByProperty(STA_RECE_PACK, staRecePack);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByStaRepSendPack(java.lang.Object)
	 */
	public List findByStaRepSendPack(Object staRepSendPack) {
		return findByProperty(STA_REP_SEND_PACK, staRepSendPack);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByStaRepSendByte(java.lang.Object)
	 */
	public List findByStaRepSendByte(Object staRepSendByte) {
		return findByProperty(STA_REP_SEND_BYTE, staRepSendByte);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByStaSendSpeed(java.lang.Object)
	 */
	public List findByStaSendSpeed(Object staSendSpeed) {
		return findByProperty(STA_SEND_SPEED, staSendSpeed);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByStaReceSpeed(java.lang.Object)
	 */
	public List findByStaReceSpeed(Object staReceSpeed) {
		return findByProperty(STA_RECE_SPEED, staReceSpeed);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByStaAllThroughput(java.lang.Object)
	 */
	public List findByStaAllThroughput(Object staAllThroughput) {
		return findByProperty(STA_ALL_THROUGHPUT, staAllThroughput);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByStaType(java.lang.Object)
	 */
	public List findByStaType(Object staType) {
		return findByProperty(STA_TYPE, staType);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByDeviceManufacturer(java.lang.Object)
	 */
	public List findByDeviceManufacturer(Object deviceManufacturer) {
		return findByProperty(DEVICE_MANUFACTURER, deviceManufacturer);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByDeviceModel(java.lang.Object)
	 */
	public List findByDeviceModel(Object deviceModel) {
		return findByProperty(DEVICE_MODEL, deviceModel);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findByOsVersion(java.lang.Object)
	 */
	public List findByOsVersion(Object osVersion) {
		return findByProperty(OS_VERSION, osVersion);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all PerfStation instances");
		try {
			String queryString = "from PerfStation";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#merge(aute.openapi.entities.PerfStation)
	 */
	public PerfStation merge(PerfStation detachedInstance) {
		log.debug("merging PerfStation instance");
		try {
			PerfStation result = (PerfStation) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#attachDirty(aute.openapi.entities.PerfStation)
	 */
	public void attachDirty(PerfStation instance) {
		log.debug("attaching dirty PerfStation instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IPerfStationDAO#attachClean(aute.openapi.entities.PerfStation)
	 */
	public void attachClean(PerfStation instance) {
		log.debug("attaching clean PerfStation instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}