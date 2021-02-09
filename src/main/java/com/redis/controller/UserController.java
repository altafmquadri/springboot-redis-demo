package com.redis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.redis.model.User;
import com.redis.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public ResponseEntity<String> saveUser(@RequestBody User user){
		boolean isSaved = userService.saveUser(user);
		if (isSaved) {
			return ResponseEntity.ok("User created Successfully!");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers(){
		List<User> users = userService.getUsers();
		return ResponseEntity.ok(users);
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
		User user = userService.getUserById(id);
		return ResponseEntity.ok(user);
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<String> saveUser(@PathVariable("id") Long id, @RequestBody User user){
		boolean isUpdated = userService.saveUser(id, user);
		if (isUpdated) {
			return ResponseEntity.ok("User has been updated Sucessfully!");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<String> deleteUserById(@PathVariable("id") Long id) {
		boolean isDeleted = userService.deleteUserById(id);
		if (isDeleted) {
			return ResponseEntity.ok("User deleted Successfully!");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}

}
