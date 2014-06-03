package aute.openapi.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import aute.openapi.dao.IInfoStationDAO;
import aute.openapi.entities.InfoStation;

/**
 * A data access object (DAO) providing persistence and search support for
 * InfoStation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see aute.openapi.entities.InfoStation
 * @author MyEclipse Persistence Tools
 */

public class InfoStationHibDAO extends BaseHibernateDAO implements IInfoStationDAO {
	private static final Logger log = LoggerFactory
			.getLogger(InfoStationHibDAO.class);
	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#save(aute.openapi.entities.InfoStation)
	 */
	public void save(InfoStation transientInstance) {
		log.debug("saving InfoStation instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#delete(aute.openapi.entities.InfoStation)
	 */
	public void delete(InfoStation persistentInstance) {
		log.debug("deleting InfoStation instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findById(java.lang.String)
	 */
	public InfoStation findById(java.lang.String id) {
		log.debug("getting InfoStation instance with id: " + id);
		try {
			InfoStation instance = (InfoStation) getSession().get(
					"aute.openapi.entities.InfoStation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByExample(aute.openapi.entities.InfoStation)
	 */
	public List findByExample(InfoStation instance) {
		log.debug("finding InfoStation instance by example");
		try {
			List results = getSession()
					.createCriteria("aute.openapi.entities.InfoStation")
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
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding InfoStation instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from InfoStation as model where model."
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
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByCollTime(java.lang.Object)
	 */
	public List findByCollTime(Object collTime) {
		return findByProperty(COLL_TIME, collTime);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByApMac(java.lang.Object)
	 */
	public List findByApMac(Object apMac) {
		return findByProperty(AP_MAC, apMac);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByWtpBelongApId(java.lang.Object)
	 */
	public List findByWtpBelongApId(Object wtpBelongApId) {
		return findByProperty(WTP_BELONG_AP_ID, wtpBelongApId);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByAcIp(java.lang.Object)
	 */
	public List findByAcIp(Object acIp) {
		return findByProperty(AC_IP, acIp);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByStaIp(java.lang.Object)
	 */
	public List findByStaIp(Object staIp) {
		return findByProperty(STA_IP, staIp);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findBySsid(java.lang.Object)
	 */
	public List findBySsid(Object ssid) {
		return findByProperty(SSID, ssid);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByStaRadioMode(java.lang.Object)
	 */
	public List findByStaRadioMode(Object staRadioMode) {
		return findByProperty(STA_RADIO_MODE, staRadioMode);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByStaRadioChannel(java.lang.Object)
	 */
	public List findByStaRadioChannel(Object staRadioChannel) {
		return findByProperty(STA_RADIO_CHANNEL, staRadioChannel);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByStaVlanId(java.lang.Object)
	 */
	public List findByStaVlanId(Object staVlanId) {
		return findByProperty(STA_VLAN_ID, staVlanId);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByAccessTime(java.lang.Object)
	 */
	public List findByAccessTime(Object accessTime) {
		return findByProperty(ACCESS_TIME, accessTime);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByOnlineTime(java.lang.Object)
	 */
	public List findByOnlineTime(Object onlineTime) {
		return findByProperty(ONLINE_TIME, onlineTime);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByStaSignalStrengt(java.lang.Object)
	 */
	public List findByStaSignalStrengt(Object staSignalStrengt) {
		return findByProperty(STA_SIGNAL_STRENGT, staSignalStrengt);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findBySnr(java.lang.Object)
	 */
	public List findBySnr(Object snr) {
		return findByProperty(SNR, snr);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByStaSendByte(java.lang.Object)
	 */
	public List findByStaSendByte(Object staSendByte) {
		return findByProperty(STA_SEND_BYTE, staSendByte);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByStaReceByte(java.lang.Object)
	 */
	public List findByStaReceByte(Object staReceByte) {
		return findByProperty(STA_RECE_BYTE, staReceByte);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByStaSendPack(java.lang.Object)
	 */
	public List findByStaSendPack(Object staSendPack) {
		return findByProperty(STA_SEND_PACK, staSendPack);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByStaRecePack(java.lang.Object)
	 */
	public List findByStaRecePack(Object staRecePack) {
		return findByProperty(STA_RECE_PACK, staRecePack);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByStaRepSendPack(java.lang.Object)
	 */
	public List findByStaRepSendPack(Object staRepSendPack) {
		return findByProperty(STA_REP_SEND_PACK, staRepSendPack);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByStaRepSendByte(java.lang.Object)
	 */
	public List findByStaRepSendByte(Object staRepSendByte) {
		return findByProperty(STA_REP_SEND_BYTE, staRepSendByte);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByStaSendSpeed(java.lang.Object)
	 */
	public List findByStaSendSpeed(Object staSendSpeed) {
		return findByProperty(STA_SEND_SPEED, staSendSpeed);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByStaReceSpeed(java.lang.Object)
	 */
	public List findByStaReceSpeed(Object staReceSpeed) {
		return findByProperty(STA_RECE_SPEED, staReceSpeed);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByStaAllThroughput(java.lang.Object)
	 */
	public List findByStaAllThroughput(Object staAllThroughput) {
		return findByProperty(STA_ALL_THROUGHPUT, staAllThroughput);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByStaType(java.lang.Object)
	 */
	public List findByStaType(Object staType) {
		return findByProperty(STA_TYPE, staType);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByDeviceManufacturer(java.lang.Object)
	 */
	public List findByDeviceManufacturer(Object deviceManufacturer) {
		return findByProperty(DEVICE_MANUFACTURER, deviceManufacturer);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByDeviceModel(java.lang.Object)
	 */
	public List findByDeviceModel(Object deviceModel) {
		return findByProperty(DEVICE_MODEL, deviceModel);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findByOsVersion(java.lang.Object)
	 */
	public List findByOsVersion(Object osVersion) {
		return findByProperty(OS_VERSION, osVersion);
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all InfoStation instances");
		try {
			String queryString = "from InfoStation";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#merge(aute.openapi.entities.InfoStation)
	 */
	public InfoStation merge(InfoStation detachedInstance) {
		log.debug("merging InfoStation instance");
		try {
			InfoStation result = (InfoStation) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#attachDirty(aute.openapi.entities.InfoStation)
	 */
	public void attachDirty(InfoStation instance) {
		log.debug("attaching dirty InfoStation instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see aute.openapi.dao.impl.IInfoStationDAO#attachClean(aute.openapi.entities.InfoStation)
	 */
	public void attachClean(InfoStation instance) {
		log.debug("attaching clean InfoStation instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}