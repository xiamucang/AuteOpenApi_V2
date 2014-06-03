package aute.openapi.dao.impl;

import org.hibernate.Session;

import aute.openapi.dao.IBaseHibernateDAO;


/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
}