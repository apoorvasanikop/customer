package com.cg.society.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.society.controller.UserController;
import com.cg.society.dto.UserRequest;
import com.cg.society.entities.User;
import com.cg.society.exceptions.UserNotFoundException;
import com.cg.society.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
public class UserController {
	
	Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService service;
	
	@GetMapping("/{name}")
	@ApiOperation("Greetings API")
	public String greetings(@PathVariable String name) {
		logger.info("Inside greetings!!");
		return "<h1>Welcome to Online Voting System " + name + "</h1>";
	}
	
	@GetMapping("/getById/{id}")
	@ApiOperation("Get User By ID")
	public User fetchById(@PathVariable String id) throws NumberFormatException, UserNotFoundException {
		logger.info("Inside fetchById %s", id);
		return service.findByUserId(Integer.valueOf(id));
	}
	
	
	@GetMapping("/getAll")
	@ApiOperation("Fetch all User Details")
	public List<User> fetch() {
		logger.info("Fetching all user records!!");
		return service.fetchAll();
	}
	
	@PutMapping("/update")
	@ApiOperation("Update an Existing User Record")
	public void update(@Valid @RequestBody User user) {
		logger.info("Updating a user!!");
		service.updateUser(user);
	}
	
	@DeleteMapping("/delete/{id}")
	@ApiOperation("Delete an Existing User Record")
	public ResponseEntity<Void> delete(@PathVariable String id) throws NumberFormatException, UserNotFoundException {
		logger.info("Deleting a user!!");
		service.deleteUser(Integer.valueOf(id));
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	
	@PostMapping("placeOrder")
	public User saveOrder(@RequestBody  UserRequest order) {
		
	return	UserService.registerUser(order.getUser());

	}

	
}
