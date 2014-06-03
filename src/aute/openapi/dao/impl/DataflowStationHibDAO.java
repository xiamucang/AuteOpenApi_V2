package aute.openapi.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import aute.openapi.dao.IDataflowStationDAO;
import aute.openapi.entities.DataflowStation;

/**
 * A data access object (DAO) providing persistence and search support for
 * DataflowStation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see aute.openapi.dao.impl.DataflowStation
 * @author MyEclipse Persistence Tools
 */

public class DataflowStationHibDAO extends BaseHibernateDAO implements
		IDataflowStationDAO {
	private static final Logger log = LoggerFactory
			.getLogger(DataflowStationHibDAO.class);

	public void save(DataflowStation transientInstance) {
		log.debug("saving DataflowStation instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DataflowStation persistentInstance) {
		log.debug("deleting DataflowStation instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DataflowStation findById(java.lang.Integer id) {
		log.debug("getting DataflowStation instance with id: " + id);
		try {
			DataflowStation instance = (DataflowStation) getSession().get(
					"aute.openapi.dao.impl.DataflowStation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DataflowStation instance) {
		log.debug("finding DataflowStation instance by example");
		try {
			List results = getSession().createCriteria(
					"aute.openapi.dao.impl.DataflowStation").add(
					Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding DataflowStation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from DataflowStation as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySrcIp(Object srcIp) {
		return findByProperty(SRC_IP, srcIp);
	}

	public List findByDestIp(Object destIp) {
		return findByProperty(DEST_IP, destIp);
	}

	public List findBySrcPort(Object srcPort) {
		return findByProperty(SRC_PORT, srcPort);
	}

	public List findByDestPort(Object destPort) {
		return findByProperty(DEST_PORT, destPort);
	}

	public List findByProtocol(Object protocol) {
		return findByProperty(PROTOCOL, protocol);
	}

	public List findByStationMac(Object stationMac) {
		return findByProperty(STATION_MAC, stationMac);
	}

	public List findByDataFlow(Object dataFlow) {
		return findByProperty(DATA_FLOW, dataFlow);
	}

	public List findByDuration(Object duration) {
		return findByProperty(DURATION, duration);
	}

	public List findAll() {
		log.debug("finding all DataflowStation instances");
		try {
			String queryString = "from DataflowStation";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DataflowStation merge(DataflowStation detachedInstance) {
		log.debug("merging DataflowStation instance");
		try {
			DataflowStation result = (DataflowStation) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DataflowStation instance) {
		log.debug("attaching dirty DataflowStation instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DataflowStation instance) {
		log.debug("attaching clean DataflowStation instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public List findStationData(String startTime, String endTime){
		log.debug("finding DataflowStation instance with startTime: "
				+ startTime + ", endTime: " + endTime);
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			String queryString = "from DataflowStation as model where model.collTime between ? and ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, startTime);
			queryObject.setParameter(1, endTime);
			
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
}