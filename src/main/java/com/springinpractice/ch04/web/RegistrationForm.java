/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch04.web;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.validator.constraints.Email;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
// Requires scripting engine (e.g. Rhino included automatically with Java 6)

public class RegistrationForm {
	private String username, firstName, lastName, email, city, contactPhone, contactName, travelArranger, company, ada;
	
	
	@NotNull
	@Size(min = 1, max = 50)
	public String getUsername() { return username; }

	public void setUsername(String userName) { this.username = userName; }


	@NotNull
	@Size(min = 1, max = 50)
	public String getFirstName() { return firstName; }

	public void setFirstName(String firstName) { this.firstName = firstName; }

	@NotNull
	@Size(min = 1, max = 50)
	public String getLastName() { return lastName; }

	public void setLastName(String lastName) { this.lastName = lastName; }
	
	@NotNull
	@Size(min = 1, max = 50)
	public String getCity() { return city; }

	public void setCity(String city) { this.city = city; }
	
	
	@NotNull
	@Size(min = 6, max = 50)
	@Email
	public String getEmail() { return email; }

	public void setEmail(String email) { this.email = email; }
	
	
	@Size(min = 1, max = 50)
	@Column(name = "company")
	public String getCompany() { return company; }
	
	public void setCompany(String company) { this.company = company; }
	
	
	@Size(min = 1, max = 50)
	@Column(name = "travel_arranger")
	public String getTravelArranger() { return travelArranger; }
	
	public void setTravelArranger(String travelArranger) { this.travelArranger = travelArranger; }
	
	
	@Size(min = 1, max = 50)
	@Column(name = "ada")
	public String getAda() { return ada; }
	
	public void setAda(String ada) { this.ada = ada; }
	
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "contact_name")
	public String getContactName() { return contactName; }
	
	public void setContactName(String contactName) { this.contactName = contactName; }
	
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "contact_phone")
	public String getContactPhone() { return contactPhone; }
	
	public void setContactPhone(String contactPhone) { this.contactPhone = contactPhone; }
	

	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
			.append("username", username)
			.append("firstName", firstName)
			.append("lastName", lastName)
			.append("email", email)
			.append("city", city)
			.append("company", company)
			.append("travelArranger", travelArranger)
			.append("ada", ada)
			.append("contactName", contactName)
			.append("contactPhone", contactPhone)
			.toString();			
	}		
}
