package com.spring.quartz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.quartz.model.Reminder;
import com.spring.quartz.repository.ReminderRepository;
import com.spring.quartz.service.ReminderService;


public class ReminderController {
	
	@Autowired
	private ReminderService reminderservice;
	
	@RequestMapping("/reminder")
	
	public List<Reminder> getAllReminders(){
		return reminderservice.getAllReminders();
	}


}
