package com.example.womenempowerment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.womenempowerment.entity.Trainee;
import com.example.womenempowerment.entity.User;
import com.example.womenempowerment.exception.TraineeAlreadyExistsException;
import com.example.womenempowerment.exception.UserAlreadyExistsException;
import com.example.womenempowerment.exception.UserDoesNotExistsException;
import com.example.womenempowerment.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User registerUser(User user) throws UserAlreadyExistsException {
		if (userRepo.existsById(user.getUserid())) {
			throw new UserAlreadyExistsException();
		} else {
			User ur = userRepo.save(user);
			return ur;
		}
	}

	@Override
	public User forgotPassword(User user) throws UserDoesNotExistsException {
		User findbyname = userRepo.findByUserName(user.getUserName());
		//User findByUserType = userRepo.findByUserType(user.getUserType());
		if(findbyname!=null) {
			return findbyname;
		}
		else {
			throw new UserDoesNotExistsException();
		}
	}
	
	@Override
	public User login(String username, String password) throws UserDoesNotExistsException {
		User findByname = userRepo.findByUserName(username);
		User findBypassword = userRepo.findByUserPassword(password);
		if(findByname!=null && findBypassword!=null) {
			return findByname;
		}
		else {
			throw new UserDoesNotExistsException();
		}
	}
}
