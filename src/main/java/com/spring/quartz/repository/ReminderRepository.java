package com.spring.quartz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.quartz.model.Reminder;

public interface ReminderRepository extends JpaRepository<Reminder, Integer> {
	
}