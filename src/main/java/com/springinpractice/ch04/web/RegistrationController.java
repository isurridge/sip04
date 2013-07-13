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
	public String getRegistrationForm(Model model) {
		
	//	model.addAttribute("breakout1Map", registrationService.buildSessionSelection("1"));       
	/*	model.addAttribute("breakout2Map", registrationService.buildSessionSelection("2"));  
		model.addAttribute("breakout3Map", registrationService.buildSessionSelection("3"));  
		model.addAttribute("breakout4Map", registrationService.buildSessionSelection("4"));  
		model.addAttribute("breakout5Map", registrationService.buildSessionSelection("5"));  
		model.addAttribute("breakout6Map", registrationService.buildSessionSelection("6"));  
		model.addAttribute("breakout7Map", registrationService.buildSessionSelection("7"));  
		model.addAttribute("breakout8Map", registrationService.buildSessionSelection("8"));  
		model.addAttribute("breakout9Map", registrationService.buildSessionSelection("9"));  
		model.addAttribute("breakout10Map", registrationService.buildSessionSelection("10"));  */
      
        Map referenceData = new HashMap();
        List<String> hobbiesList = new ArrayList<String>();
        hobbiesList.add("Gardening");
        hobbiesList.add("Listening Music");
        hobbiesList.add("Writing Technical Tutorials");
        referenceData.put("breakout1Map", hobbiesList);
  
     //   return referenceData;
		
    	model.addAttribute("breakout1Map", hobbiesList); 
		
		model.addAttribute("registration", new RegistrationForm());
		return VN_REG_FORM;

   

	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ModelAndView postRegistrationForm(
			@ModelAttribute("registration") @Valid RegistrationForm form, BindingResult result) {
			
			
			log.debug("result.getModel():   "  + form.getBreakout1());
   
			
	        Map referenceData = new HashMap();
	        List<String> hobbiesList = new ArrayList<String>();
	        hobbiesList.add("Gardening");
	        hobbiesList.add("Listening Music");
	        hobbiesList.add("Writing Technical Tutorials");
			
		registrationService.addRegistration(toRegistration(form), result);
		return (result.hasErrors() ? new ModelAndView(VN_REG_FORM, "breakout1Map", hobbiesList ): new ModelAndView (VN_REG_OK));
	}
	
	

	
	
	private static Registration toRegistration(RegistrationForm form) {
		

	//	form.setBreakout1Map(hobbiesList);
		
//	   	log.debug("");
		
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

	/*	registration.setBreakout2(form.getBreakout2());
		registration.setBreakout3(form.getBreakout3());
		registration.setBreakout4(form.getBreakout4());
		registration.setBreakout5(form.getBreakout5());
		registration.setBreakout6(form.getBreakout6());
		registration.setBreakout7(form.getBreakout7());
		registration.setBreakout8(form.getBreakout8());
		registration.setBreakout9(form.getBreakout9());
		registration.setBreakout10(form.getBreakout10());  */
		registration.setHotelArrive(form.getHotelArrive());
		registration.setHotelDepart(form.getHotelDepart());
		return registration;
	}
}
