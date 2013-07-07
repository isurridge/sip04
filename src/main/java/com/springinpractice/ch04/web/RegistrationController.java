/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch04.web;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springinpractice.ch04.domain.Registration;
import com.springinpractice.ch04.service.RegistrationService;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@Controller
@RequestMapping("/events")
public class RegistrationController {
	private static final String VN_REG_FORM = "events/regForm";
	private static final String VN_REG_OK = "redirect:events/reg_ok.html";
	
	@Inject private RegistrationService registrationService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setAllowedFields(new String[] { 
			"username",	"firstName", "lastName", "email", "city"
		});
		
		// Converts empty string to null, which is nice since most validation rules fire only if the field isn't null.
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String getRegistrationForm(Model model) {
		model.addAttribute("registration", new RegistrationForm());
		return VN_REG_FORM;
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String postRegistrationForm(
			@ModelAttribute("registration") @Valid RegistrationForm form,
			BindingResult result) {
		
		
		registrationService.addRegistration(toRegistration(form), result);
		return (result.hasErrors() ? VN_REG_FORM : VN_REG_OK);
	}


	
	private static Registration toRegistration(RegistrationForm form) {
		Registration registration = new Registration();
		registration.setUsername(form.getUsername());
		registration.setFirstName(form.getFirstName());
		registration.setLastName(form.getLastName());
		registration.setEmail(form.getEmail());
		registration.setCity(form.getCity());
		return registration;
	}
}
