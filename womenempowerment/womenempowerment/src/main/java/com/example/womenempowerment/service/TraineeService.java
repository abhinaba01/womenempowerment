package com.example.womenempowerment.service;

import java.util.List;
import java.util.Optional;

import com.example.womenempowerment.entity.Trainee;
import com.example.womenempowerment.exception.TraineeAlreadyExistsException;
import com.example.womenempowerment.exception.TraineeDoesNotExistsException;

public interface TraineeService {
Trainee addTrainee(Trainee trainee) throws TraineeAlreadyExistsException;
	
	Trainee updateTrainee(Trainee trainee);
	
	Optional<Trainee> viewTrainee(int traineeId) throws TraineeDoesNotExistsException;
	
	List<Trainee> viewAllTrainee();
	
	void deleteTrainee(int traineeId) throws TraineeDoesNotExistsException;
	
	List<Trainee> viewAllTraineesByLocation(String location) throws TraineeDoesNotExistsException;
	
	Trainee viewTraineeByAadhar(long AadharNo) throws TraineeDoesNotExistsException;

}
