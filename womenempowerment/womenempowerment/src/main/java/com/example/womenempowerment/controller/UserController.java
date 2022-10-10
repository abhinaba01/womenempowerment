package com.example.womenempowerment.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.womenempowerment.entity.User;
import com.example.womenempowerment.exception.UserAlreadyExistsException;
import com.example.womenempowerment.exception.UserDoesNotExistsException;
import com.example.womenempowerment.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userServ;

	@PostMapping("/User")
	public ResponseEntity<User> registerUser(@RequestBody User User) throws UserAlreadyExistsException {
		User ts = userServ.registerUser(User);
		return new ResponseEntity<User>(ts, HttpStatus.ACCEPTED);
	}

	
	@GetMapping("/Userlogin/{username}/{password}")
	public ResponseEntity<String> login(@PathVariable String username, @PathVariable String password) throws UserDoesNotExistsException {
		User viewById = userServ.login(username, password);
		if(viewById!=null) {
			return new ResponseEntity("Logged in successfully",HttpStatus.OK);
		}
		else {
			throw new UserDoesNotExistsException();
		}
	}

	@GetMapping("/UserforgotPassword")
	public ResponseEntity<User> forgotPassword(@RequestBody User user) throws UserDoesNotExistsException {
		User us = userServ.forgotPassword(user);
		return new ResponseEntity<User>(us, HttpStatus.OK);
	}
}
