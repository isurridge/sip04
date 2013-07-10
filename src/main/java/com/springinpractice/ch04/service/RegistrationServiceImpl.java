/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch04.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;

import com.springinpractice.ch04.dao.AccountDao;
import com.springinpractice.ch04.dao.RegistrationDao;
import com.springinpractice.ch04.dao.RoleDao;
import com.springinpractice.ch04.domain.Account;
import com.springinpractice.ch04.domain.Registration;
import com.springinpractice.ch04.domain.Role;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@Service
@Transactional(readOnly = true)
public class RegistrationServiceImpl implements RegistrationService {
	private static final Logger log = LoggerFactory.getLogger(RegistrationServiceImpl.class);
	
	@Inject private RegistrationDao registrationDao;

	
	@Override
	@Transactional(readOnly = false)	
    public List buildSessionSelection(String fieldName){    	
		List<String> interestsMap = new ArrayList<String>();  
		interestsMap.add("Judo");  
		interestsMap.add("Basketball");  
        interestsMap.add("Ping-Pong");
    	return interestsMap;
    }
	
	
	@Override
	@Transactional(readOnly = false)	
	public boolean addRegistration(Registration registration,  Errors errors) {
		
		boolean valid = !errors.hasErrors();
		
		log.debug(registration.getInterest().toString());
		if (valid) {
			registrationDao.create(registration);
		}
		
		return valid;
	}
	

}
