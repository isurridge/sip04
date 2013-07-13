/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch04.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springinpractice.ch04.domain.Registration;
import com.springinpractice.ch04.service.RegistrationService;
import com.springinpractice.ch04.service.RegistrationServiceImpl;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@Controller
@RequestMapping("/events")
public class RegistrationController {
	private static final String VN_REG_FORM = "events/regForm";
	private static final String VN_REG_OK = "redirect:events/reg_ok.html";
	private static final Logger log = LoggerFactory
			.getLogger(RegistrationController.class);
	
	
	@Inject private RegistrationService registrationService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setAllowedFields(new String[] { 
			"username",	"firstName", "lastName", "email", "city", "contactPhone", "contactName", "travelArranger", "company", "ada", "breakout1",
			"breakout1", "breakout2", "breakout3", "breakout4", "breakout5", "breakout6", "breakout7", "breakout8","breakout9", "breakout10",
			"hotelArrive", "hotelDepart"
		});
		
		// Converts empty string to null, which is nice since most validation rules fire only if the field isn't null.
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView getRegistrationForm(Model model) {
		

		Map<String, List> map = new HashMap<String, List>();
        map.putAll(loadBreakouts());
        model.addAllAttributes(map);
        model.addAttribute("registration", new RegistrationForm() );
      
        Object[] arr = model.asMap().values().toArray();
        for(int i = 0; i < arr.length; i++){
        
        log.debug("Attributes: " + arr[i].toString());
        
        }
		
		return new ModelAndView(VN_REG_FORM, "model", model );

   

	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ModelAndView postRegistrationForm(
			@ModelAttribute("registration") @Valid RegistrationForm form, BindingResult result) {
			
			
			log.debug("result.getModel():   "  + form.getBreakout1());
   
			
		Map model = loadBreakouts();
			
		registrationService.addRegistration(toRegistration(form), result);
		return (result.hasErrors() ? new ModelAndView(VN_REG_FORM, "model", model ): new ModelAndView (VN_REG_OK));
	}
	
	
	
	private Map loadBreakouts(){
		
        Map<String, List<String>> referenceData = new HashMap<String, List<String>>();

        referenceData.put("breakout1Map", registrationService.buildSessionSelection("1"));
        referenceData.put("breakout2Map", registrationService.buildSessionSelection("2"));  
        referenceData.put("breakout3Map", registrationService.buildSessionSelection("3"));  
        referenceData.put("breakout4Map", registrationService.buildSessionSelection("4"));  
        referenceData.put("breakout5Map", registrationService.buildSessionSelection("5"));  
        referenceData.put("breakout6Map", registrationService.buildSessionSelection("6"));  
        referenceData.put("breakout7Map", registrationService.buildSessionSelection("7"));  
        referenceData.put("breakout8Map", registrationService.buildSessionSelection("8"));  
        referenceData.put("breakout9Map", registrationService.buildSessionSelection("9"));  
        referenceData.put("breakout10Map", registrationService.buildSessionSelection("10"));
		return referenceData;
		
	}

	
	
	private static Registration toRegistration(RegistrationForm form) {
	
		Registration registration = new Registration();
		registration.setUsername(form.getUsername());
		registration.setFirstName(form.getFirstName());
		registration.setLastName(form.getLastName());
		registration.setEmail(form.getEmail());
		registration.setCity(form.getCity());
		registration.setCompany(form.getCompany());
		registration.setTravelArranger(form.getTravelArranger());
		registration.setAda(form.getAda());
		registration.setContactName(form.getContactName());
		registration.setContactPhone(form.getContactPhone());
		registration.setBreakout1(form.getBreakout1());
		registration.setBreakout2(form.getBreakout2());
		registration.setBreakout3(form.getBreakout3());
		registration.setBreakout4(form.getBreakout4());
		registration.setBreakout5(form.getBreakout5());
		registration.setBreakout6(form.getBreakout6());
		registration.setBreakout7(form.getBreakout7());
		registration.setBreakout8(form.getBreakout8());
		registration.setBreakout9(form.getBreakout9());
		registration.setBreakout10(form.getBreakout10());  
		registration.setHotelArrive(form.getHotelArrive());
		registration.setHotelDepart(form.getHotelDepart());
		return registration;
	}
}
