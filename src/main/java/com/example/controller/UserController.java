package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome To AlgoWebPro!!";
	}
	
	//create user
	@PostMapping()
	public ResponseEntity<User> createUser(@RequestBody User user){
		User createUser = userService.createUser(user);
		return new ResponseEntity<>(createUser,HttpStatus.CREATED);
	}
	
	
	// get  All Users
	@GetMapping()
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> allUser = userService.getAllUsers();
		return ResponseEntity.ok(allUser);
	}
}
