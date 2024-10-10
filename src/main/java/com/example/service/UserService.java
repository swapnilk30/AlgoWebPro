package com.example.service;

import java.util.List;

import com.example.entity.User;

public interface UserService {

	//create User
	User createUser(User user);
	
	//getAll Users
	List<User> getAllUsers();
	
	//get user by id
	User getUserById(String userId);
	
	//update user
	User updateUser(String userId,User user);
	
	//delete user
	void deleteUser(String userId);
}
