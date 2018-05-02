package com.spring.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.quartz.service.ReminderService;
import com.spring.quartz.service.UserService;

public class SampleJob implements Job {
	
	@Autowired
    private UserService userservice;
	
	@Autowired
    private ReminderService reminderservice;

	
	@Override
    public void execute(JobExecutionContext jobExecutionContext) {
   
        userservice.getAllUsers();
        reminderservice.getAllReminders();
        
        System.out.println("I am running locally!!");
       
    }
}
