package com.spring.quartz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.quartz.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	
}