package com.example.womenempowerment.service;

import java.util.Optional;

import com.example.womenempowerment.entity.User;
import com.example.womenempowerment.exception.UserAlreadyExistsException;
import com.example.womenempowerment.exception.UserDoesNotExistsException;

public interface UserService {
	
	User registerUser(User user) throws UserAlreadyExistsException;
	
	User login(String userName, String userPassword) throws UserDoesNotExistsException;
	
	User forgotPassword(User user) throws UserDoesNotExistsException;
}
