/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch04.dao.hbn;

import org.hibernate.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.springinpractice.ch04.dao.RegistrationDao;
import com.springinpractice.ch04.domain.Account;
import com.springinpractice.ch04.domain.Registration;
import com.springinpractice.dao.hibernate.AbstractHbnDao;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@Repository
public class HbnRegistrationDao extends AbstractHbnDao<Registration> implements RegistrationDao {
	private static final Logger LOG = LoggerFactory.getLogger(HbnRegistrationDao.class);
	

	
	public void create(Registration registration, String password) {
		LOG.debug("Creating Registration");
		create(registration);
		
	}

	public Registration findByUsername(String username) {
		Query q = getSession().getNamedQuery("findRegistrationByUsername");
		q.setParameter("username", username);
		return (Registration) q.uniqueResult();
	}
}
