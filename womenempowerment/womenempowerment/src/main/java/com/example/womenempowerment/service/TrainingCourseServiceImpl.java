package com.example.womenempowerment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.womenempowerment.entity.TrainingCourse;
import com.example.womenempowerment.exception.TrainingCourseAlreadyExistsException;
import com.example.womenempowerment.exception.TrainingCourseDoesNotExistsException;
import com.example.womenempowerment.repository.TrainingCourseRepository;

@Service
public class TrainingCourseServiceImpl implements TrainingCourseService{
	
	@Autowired
	private TrainingCourseRepository trainingCourseRepo;
	
	@Override
	public TrainingCourse addTrainingCourse(TrainingCourse course) throws TrainingCourseAlreadyExistsException{
		if(trainingCourseRepo.existsById(course.getTrainingCourseId())) {
			throw new TrainingCourseAlreadyExistsException();
		}
		else {
			TrainingCourse tc = trainingCourseRepo.save(course);
			return tc;			
		}
	}
	
	@Override
	public TrainingCourse updateTrainingCourse(TrainingCourse course) {
		TrainingCourse tc = trainingCourseRepo.save(course);
		return tc;
	}

	@Override
	public Optional<TrainingCourse> viewTrainingCourse(int courseId) throws TrainingCourseDoesNotExistsException{
		Optional<TrainingCourse> viewcourse = trainingCourseRepo.findById(courseId);
		return viewcourse;
	}

	@Override
	public List<TrainingCourse> viewAllTrainingCourse() {
		List<TrainingCourse> viewAll = trainingCourseRepo.findAll();
		return viewAll;
	}
	
	@Override
	public void deleteTrainingCourse(int courseId) throws TrainingCourseDoesNotExistsException{
		trainingCourseRepo.deleteById(courseId);
	}

	@Override
	public TrainingCourse viewByTrainingCourseName(String courseName) throws TrainingCourseDoesNotExistsException{
		TrainingCourse viewByCourseName = trainingCourseRepo.viewByTrainingCourseName(courseName);
		return viewByCourseName;
	}
}
