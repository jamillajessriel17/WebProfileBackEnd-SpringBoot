package com.webprofile.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webprofile.model.User;
import com.webprofile.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService repository;

	@PostMapping("/SaveUser")
	public String saveUser(@RequestBody User user) {
		repository.save(user);
		return "User Added with ID: " + user.getId();

	}

	@GetMapping("/GetUser")
	public List<User> getUser() {
		return repository.findAll();
	}
	
	@GetMapping("/GetUser/{id}")
	public Optional<User> getUserById(@PathVariable int id) {
		return repository.findById(id);
	}
}
