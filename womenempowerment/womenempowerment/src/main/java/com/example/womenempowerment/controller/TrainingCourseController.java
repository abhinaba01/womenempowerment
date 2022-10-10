package com.example.womenempowerment.controller;

import java.util.List;
import java.util.Optional;

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

import com.example.womenempowerment.entity.TrainingCourse;
import com.example.womenempowerment.exception.TrainingCourseAlreadyExistsException;
import com.example.womenempowerment.exception.TrainingCourseDoesNotExistsException;
import com.example.womenempowerment.service.TrainingCourseService;

@RestController
public class TrainingCourseController {
	
	@Autowired
	private TrainingCourseService trainingCourseServ;
	
	@PostMapping("/trainingcourse")
	public ResponseEntity<TrainingCourse> addTrainingCourse(@RequestBody TrainingCourse course) throws TrainingCourseAlreadyExistsException{
		TrainingCourse tcs = trainingCourseServ.addTrainingCourse(course);
		return new ResponseEntity<TrainingCourse>(tcs,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/updatetrainingcourse")
	public ResponseEntity<TrainingCourse> updateTrainingCourse(@RequestBody TrainingCourse course){
		TrainingCourse updatecourse = trainingCourseServ.updateTrainingCourse(course);
		return new ResponseEntity<TrainingCourse>(updatecourse,HttpStatus.OK);
	}
	
	@GetMapping("/trainingcourse/{courseId}")
	public ResponseEntity<Optional<TrainingCourse>> viewTrainingCourseById(@PathVariable int courseId) throws TrainingCourseDoesNotExistsException{
		Optional<TrainingCourse> viewById = trainingCourseServ.viewTrainingCourse(courseId);
		if(!viewById.isEmpty()) {
			return new ResponseEntity<Optional<TrainingCourse>>(viewById,HttpStatus.OK);
		}
		else {
			throw new TrainingCourseDoesNotExistsException();
		}
	}
	
	@GetMapping("/trainingcourses")
	public ResponseEntity<List<TrainingCourse>> viewAllTrainingCourse(){
		List<TrainingCourse> viewAll = trainingCourseServ.viewAllTrainingCourse();
		return new ResponseEntity<List<TrainingCourse>>(viewAll,HttpStatus.OK);
	}
	
	@DeleteMapping("/trainingcourse/{courseId}")
	public ResponseEntity<String> deleteTrainingCourse(@PathVariable int courseId) throws TrainingCourseDoesNotExistsException{
		Optional<TrainingCourse> viewById = trainingCourseServ.viewTrainingCourse(courseId);
		if(!viewById.isEmpty()) {
			trainingCourseServ.deleteTrainingCourse(courseId);
			return new ResponseEntity<String>("Deleted successfully",HttpStatus.OK);
		}
		else{
			throw new TrainingCourseDoesNotExistsException();
		}
	}
	
	@GetMapping("/viewtrainingcourses/{courseName}")
	public ResponseEntity<TrainingCourse> viewByTrainingCourseName(@PathVariable String courseName) throws TrainingCourseDoesNotExistsException{
		if(trainingCourseServ.viewByTrainingCourseName(courseName) != null) {
			TrainingCourse viewByCourseName = trainingCourseServ.viewByTrainingCourseName(courseName);
			return new ResponseEntity<TrainingCourse>(viewByCourseName,HttpStatus.OK);
		}
		else {
			throw new TrainingCourseDoesNotExistsException();
		}
	}
}
