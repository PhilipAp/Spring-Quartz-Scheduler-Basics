package com.spring.quartz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.quartz.model.Reminder;
import com.spring.quartz.repository.ReminderRepository;

@Service
public class ReminderService {
	
private ReminderRepository reminderRepository;

	
public class ReminderService(ReminderRepository reminderRepository){
        this.reminderRepository = reminderRepository;
}

public List<Reminder> getAllReminders(){
		return reminderRepository.findAll();
	}
	
}
