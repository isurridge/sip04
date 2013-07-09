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
	private boolean brSession1, brSession2, brSession3, brSession4, brSession5, brSession6, brSession7, brSession8, brSession9, brSession10;
	
	
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
	
	
	
	
	
	
	@Column(name = "br_session1")
	public boolean getBrSession1() { return brSession1; }
	
	public void setBrSession1(boolean brSession1) { this.brSession1 = brSession1; }
	
	
	@Column(name = "br_session2")
	public boolean getBrSession2() { return brSession2; }
	
	public void setBrSession2(boolean brSession2) { this.brSession2 = brSession2; }
	
	
	@Column(name = "br_session3")
	public boolean getBrSession3() { return brSession3; }
	
	public void setBrSession3(boolean brSession3) { this.brSession3 = brSession3; }
	
	
	@Column(name = "br_session4")
	public boolean getBrSession4() { return brSession4; }
	
	public void setBrSession4(boolean brSession4) { this.brSession4 = brSession4; }
	
	
	@Column(name = "br_session5")
	public boolean getBrSession5() { return brSession5; }
	
	public void setBrSession5(boolean brSession5) { this.brSession5 = brSession5; }
	
	
	@Column(name = "br_session6")
	public boolean getBrSession6() { return brSession6; }
	
	public void setBrSession6(boolean brSession6) { this.brSession6 = brSession6; }
	
	
	@Column(name = "br_session7")
	public boolean getBrSession7() { return brSession7; }
	
	public void setBrSession7(boolean brSession7) { this.brSession7 = brSession7; }
	
	
	@Column(name = "br_session8")
	public boolean getBrSession8() { return brSession8; }
	
	public void setBrSession8(boolean brSession8) { this.brSession8 = brSession8; }
	
	
	@Column(name = "br_session9")
	public boolean getBrSession9() { return brSession9; }
	
	public void setBrSession9(boolean brSession9) { this.brSession9 = brSession9; }
	
	
	@Column(name = "br_session10")
	public boolean getBrSession10() { return brSession10; }
	
	public void setBrSession10(boolean brSession10) { this.brSession10 = brSession10; }
	

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
						.append("brSession1", brSession1)
									.append("brSession2", brSession2)
												.append("brSession3", brSession3)
															.append("brSession4", brSession4)
																		.append("brSession5", brSession5)
																					.append("brSession6", brSession6)
																								.append("brSession7", brSession7)
																										.append("brSession8", brSession8)
																													.append("brSession9", brSession9)
																															.append("brSession10", brSession10)
			.toString();			
	}		
}
