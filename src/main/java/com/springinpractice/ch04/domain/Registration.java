/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch04.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@NamedQuery(name = "findRegistrationByUsername", query = "from Registration where username = :username")
@Entity
@Table(name = "registration")
public class Registration {
	private Long id;
	private String username, firstName, lastName, email, city, contactPhone,
			contactName, travelArranger, company, ada,
			breakout1, breakout2, breakout3, breakout4, breakout5,
			breakout6, breakout7, breakout8, breakout9, breakout10, incidentals;
	private Date dateCreated, hotelArrive, hotelDeparture;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(Long id) {
		this.id = id;
	}

	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "first_name")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "last_name")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Transient
	public String getFullName() {
		return firstName + " " + lastName;
	}

	@NotNull
	@Size(min = 6, max = 50)
	@Email
	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Size(min = 1, max = 50)
	@Column(name = "company")
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Size(min = 1, max = 50)
	@Column(name = "travel_arranger")
	public String getTravelArranger() {
		return travelArranger;
	}

	public void setTravelArranger(String travelArranger) {
		this.travelArranger = travelArranger;
	}

	@Size(min = 1, max = 500)
	@Column(name = "ada")
	public String getAda() {
		return ada;
	}

	public void setAda(String ada) {
		this.ada = ada;
	}



	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "contact_name")
	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "contact_phone")
	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	@Column(name = "breakout1")
	public String getBreakout1() {
		return breakout1;
	}

	public void setBreakout1(String breakout1) {
		this.breakout1 = breakout1;
	}

	@Column(name = "breakout2")
	public String getBreakout2() {
		return breakout2;
	}

	public void setBreakout2(String breakout2) {
		this.breakout2 = breakout2;
	}

	@Column(name = "breakout3")
	public String getBreakout3() {
		return breakout3;
	}

	public void setBreakout3(String breakout3) {
		this.breakout3 = breakout3;
	}

	@Column(name = "breakout4")
	public String getBreakout4() {
		return breakout4;
	}

	public void setBreakout4(String breakout4) {
		this.breakout4 = breakout4;
	}

	@Column(name = "breakout5")
	public String getBreakout5() {
		return breakout5;
	}

	public void setBreakout5(String breakout5) {
		this.breakout5 = breakout5;
	}

	@Column(name = "breakout6")
	public String getBreakout6() {
		return breakout6;
	}

	public void setBreakout6(String breakout6) {
		this.breakout6 = breakout6;
	}

	@Column(name = "breakout7")
	public String getBreakout7() {
		return breakout7;
	}

	public void setBreakout7(String breakout7) {
		this.breakout7 = breakout7;
	}

	@Column(name = "breakout8")
	public String getBreakout8() {
		return breakout8;
	}

	public void setBreakout8(String breakout8) {
		this.breakout8 = breakout8;
	}

	@Column(name = "breakout9")
	public String getBreakout9() {
		return breakout9;
	}

	public void setBreakout9(String breakout9) {
		this.breakout9 = breakout9;
	}

	@Column(name = "breakout10")
	public String getBreakout10() {
		return breakout10;
	}

	public void setBreakout10(String breakout10) {
		this.breakout10 = breakout10;
	}

	@Column(name = "hotel_arrive")
	public Date getHotelArrive() {
		return hotelArrive;
	}

	public void setHotelArrive(Date hotelArrive) {
		this.hotelArrive = hotelArrive;
	}

	@Column(name = "hotel_departure")
	public Date getHotelDeparture() {
		return hotelDeparture;
	}

	public void setHotelDeparture(Date hotelDeparture) {
		this.hotelDeparture = hotelDeparture;
	}
	
	
	@Size(min = 1, max = 100)
	@Column(name = "incidentals")
	public String getIncidentals() {
		return incidentals;
	}

	public void setIncidentals(String incidentals) {
		this.incidentals = incidentals;
	}
	
	

	@Column(name = "date_created")
	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
}
