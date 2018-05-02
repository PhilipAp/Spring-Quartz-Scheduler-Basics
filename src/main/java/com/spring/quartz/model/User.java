package com.spring.quartz.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int idxxclaim_members;
	private String surname;
	private String firstName;
	private String middleName;
	private String primaryPhoneNumber;
	private LocalDate dateOfBirth;
	
	public User(){  }
	
	
	public int getCompanyid() {
		return idxxclaim_members;
	}
	
		
	

	public User(int idxxclaim_members, String surname, String firstName, String middleName, String primaryPhoneNumber,
			LocalDate dateOfBirth) {
		super();
		this.idxxclaim_members = idxxclaim_members;
		this.surname = surname;
		this.firstName = firstName;
		this.middleName = middleName;
		this.primaryPhoneNumber = primaryPhoneNumber;
		this.dateOfBirth = dateOfBirth;
	}


	public int getIdxxclaim_members() {
		return idxxclaim_members;
	}


	public void setIdxxclaim_members(int idxxclaim_members) {
		this.idxxclaim_members = idxxclaim_members;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getPrimaryPhoneNumber() {
		return primaryPhoneNumber;
	}


	public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
		this.primaryPhoneNumber = primaryPhoneNumber;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
