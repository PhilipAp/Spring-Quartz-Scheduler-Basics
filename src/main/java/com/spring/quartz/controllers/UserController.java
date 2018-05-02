package com.spring.quartz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.quartz.model.User;
import com.spring.quartz.repository.UserRepository;
import com.spring.quartz.service.UserService;



public class UserController {
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/user")
	
	public List<User> getAllUser(){
		return userservice.getAllUsers();
	}

}
