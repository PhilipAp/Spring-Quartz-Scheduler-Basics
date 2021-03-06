package com.spring.quartz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.quartz.model.User;
import com.spring.quartz.repository.UserRepository;



@Service
public class UserService {
	
private UserRepository userRepository;
	
public class UserService(UserRepository userRepository){
	this.userRepository = userRepository;
}

public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
}
