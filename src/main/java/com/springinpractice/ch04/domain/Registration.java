/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch04.domain;

import java.util.ArrayList;
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
@NamedQuery(
	name = "findRegistrationByUsername",
	query = "from Registration where username = :username")
@Entity
@Table(name = "registration")
public class Registration {
	private Long id;
	private String username, firstName, lastName, email, city, contactPhone, contactName, travelArranger, company, ada;
	private Date dateCreated;
	private String interest[];
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Long getId() { return id; }
	
	@SuppressWarnings("unused")
	private void setId(Long id) { this.id = id; }
	
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "username")
	public String getUsername() { return username; }

	public void setUsername(String username) { this.username = username; }
	
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "first_name")
	public String getFirstName() { return firstName; }

	public void setFirstName(String firstName) { this.firstName = firstName; }
	
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "last_name")
	public String getLastName() { return lastName; }

	public void setLastName(String lastName) { this.lastName = lastName; }
	
	@Transient
	public String getFullName() { return firstName + " " + lastName; }
	
	@NotNull
	@Size(min = 6, max = 50)
	@Email
	@Column(name = "email")
	public String getEmail() { return email; }

	public void setEmail(String email) { this.email = email; }
	
	
	
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "city")
	public String getCity() { return city; }
	
	public void setCity(String city) { this.city = city; }
	
	
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
	
	
	@Column(name = "interest")	
    public String[] getInterest() {
        return interest;
    }

    public void setInterest(String[] interest) {
        this.interest = interest;
    }
	
	

	
	
	
	
	
	
	@Column(name = "date_created")
	public Date getDateCreated() { return dateCreated; }
	
	public void setDateCreated(Date dateCreated) { this.dateCreated = dateCreated; }
}
