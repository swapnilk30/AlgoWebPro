package com.example.service;

import java.util.List;

import com.example.entity.User;

public interface UserService {

	//create User
	User createUser(User user);
	
	//getAll Users
	List<User> getAllUser();
}
