package com.example.womenempowerment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.womenempowerment.entity.TrainingCourse;

public interface TrainingCourseRepository extends JpaRepository<TrainingCourse, Integer>{
	
	@Query("select tc from TrainingCourse tc where tc.courseName=:name")
	public TrainingCourse viewByTrainingCourseName(@Param("name")String courseName);
}
