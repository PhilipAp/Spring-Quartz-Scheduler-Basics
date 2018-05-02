package com.spring.quartz.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reminder implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int idxxclaim_payment;
	private LocalDate enddate;
	
	public Reminder(){}

	
	public Reminder(int idxxclaim_payment, LocalDate enddate) {
		super();
		this.idxxclaim_payment = idxxclaim_payment;
		this.enddate = enddate;
	}


	public int getIdxxclaim_payment() {
		return idxxclaim_payment;
	}


	public void setIdxxclaim_payment(int idxxclaim_payment) {
		this.idxxclaim_payment = idxxclaim_payment;
	}


	public LocalDate getEnddate() {
		return enddate;
	}


	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
