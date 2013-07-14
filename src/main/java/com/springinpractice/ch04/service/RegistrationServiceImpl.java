/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch04.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;

import com.springinpractice.ch04.dao.EventDao;
import com.springinpractice.ch04.dao.RegistrationDao;
import com.springinpractice.ch04.domain.Event;
import com.springinpractice.ch04.domain.Registration;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@Service
@Transactional(readOnly = true)
public class RegistrationServiceImpl implements RegistrationService {
	private static final Logger log = LoggerFactory
			.getLogger(RegistrationServiceImpl.class);

	@Inject
	private RegistrationDao registrationDao;
	@Inject
	private EventDao eventDao;

	@Override
	@Transactional(readOnly = false)
	public List<String> buildSessionSelection(String fieldName) {

		List<String> interestsMap = new ArrayList<String>();
		for (Event lst : eventDao.findAllBreakouts()) {
			log.debug(lst.getSessionTitle());
			log.debug("Slot #: " + lst.getSessionSlot() + "   field name: " + fieldName);
			if (lst.getSessionSlot().equals(fieldName)) {
				interestsMap.add(lst.getSessionTitle());
			}

		}
		
		if(interestsMap.isEmpty()){
			interestsMap.add("No Scheduled Session at this time");
		}

		return interestsMap;
	}

	@Override
	@Transactional(readOnly = false)
	public boolean addRegistration(Registration registration, Errors errors) {

		boolean valid = !errors.hasErrors();

		if (valid) {
			registrationDao.create(registration);
		}

		return valid;
	}
	
	
	@Override
	@Transactional(readOnly = false)
	public List loadIncidentals() {
		
		List<String> incidentals = new ArrayList();
		incidentals.add("My corporate or personal credit card");
		incidentals.add("My profit center manager's credit card");
		incidentals.add("No card available - need to use corporate account");
		
		return incidentals;
	}
	
	@Override
	@Transactional(readOnly = false)
	public List<String> loadDiet() {
		
		List<String> diet = new ArrayList<String>();
		diet.add("Vegan");
		diet.add("Vegeterian");
		diet.add("No Carb");
		
		return diet;
	}

	@Override
	public List<String> loadActivities() {
		
		List<String> interestsMap = new ArrayList<String>();
		for (Event lst : eventDao.findAllActivities()) {
			log.debug(lst.getSessionTitle());

			if (!lst.getSessionTitle().equals(null)) {
				interestsMap.add(lst.getSessionTitle());
			}

		}
		
		if(interestsMap.isEmpty()){
			interestsMap.add("No Scheduled Activies at this time");
		}

		return interestsMap;
	}
	
	
	
	
	
	
	
	
	
	
}
