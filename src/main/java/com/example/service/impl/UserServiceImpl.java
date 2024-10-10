package com.example.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		//create random user id
		user.setUserId(UUID.randomUUID().toString());
		
		//date 
		user.setCreatedAt(new Date());
		
		User savedUser = userRepository.save(user);
		return savedUser;
	}

	@Override
	public List<User> getAllUser() {
		List<User> users = userRepository.findAll();
		return users;
	}

}
