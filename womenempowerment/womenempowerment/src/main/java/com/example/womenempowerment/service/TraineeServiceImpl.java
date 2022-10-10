package com.example.womenempowerment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.womenempowerment.entity.Trainee;

import com.example.womenempowerment.exception.TraineeAlreadyExistsException;
import com.example.womenempowerment.exception.TraineeDoesNotExistsException;
import com.example.womenempowerment.repository.TraineeRepository;

@Service
public class TraineeServiceImpl implements TraineeService{
	
	@Autowired
	private TraineeRepository traineeRepo;
	
	@Override
	public Trainee addTrainee(Trainee trainee) throws TraineeAlreadyExistsException{
		if(traineeRepo.existsById(trainee.getTraineeId())) {
			throw new TraineeAlreadyExistsException();
		}
		else {
			Trainee tr = traineeRepo.save(trainee);
			return tr;			
		}
	}
	
	@Override
	public Trainee updateTrainee(Trainee trainee) {
		Trainee tc = traineeRepo.save(trainee);
		return tc;
	}

	@Override
	public Optional<Trainee> viewTrainee(int traineeId) throws TraineeDoesNotExistsException{
		Optional<Trainee> viewtrainee = traineeRepo.findById(traineeId);
		return viewtrainee;
	}

	@Override
	public List<Trainee> viewAllTrainee() {
		List<Trainee> viewAll = traineeRepo.findAll();
		return viewAll;
	}
	
	@Override
	public void deleteTrainee(int traineeId) throws TraineeDoesNotExistsException{
		traineeRepo.deleteByCourseId(traineeId);
	}

	@Override
	public List<Trainee> viewAllTraineesByLocation(String location) {
		List<Trainee> viewByLocation = traineeRepo.viewAllTraineesByLocation(location);
		return viewByLocation;
	}

	@Override
	public Trainee viewTraineeByAadhar(long aadharNo) {
		Trainee trainee  = traineeRepo.findByAadharNo(aadharNo);
	      
	    return trainee;
	}
}
