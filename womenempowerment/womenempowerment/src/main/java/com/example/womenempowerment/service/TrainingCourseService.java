package com.example.womenempowerment.service;

import java.util.List;
import java.util.Optional;

import com.example.womenempowerment.entity.TrainingCourse;
import com.example.womenempowerment.exception.TrainingCourseAlreadyExistsException;
import com.example.womenempowerment.exception.TrainingCourseDoesNotExistsException;

public interface TrainingCourseService {
	TrainingCourse addTrainingCourse(TrainingCourse course) throws TrainingCourseAlreadyExistsException;
	
	TrainingCourse updateTrainingCourse(TrainingCourse course);
	
	Optional<TrainingCourse> viewTrainingCourse(int courseId) throws TrainingCourseDoesNotExistsException;
	
	List<TrainingCourse> viewAllTrainingCourse();
	
	void deleteTrainingCourse(int courseId) throws TrainingCourseDoesNotExistsException;
	
	TrainingCourse viewByTrainingCourseName(String courseName) throws TrainingCourseDoesNotExistsException;
}
