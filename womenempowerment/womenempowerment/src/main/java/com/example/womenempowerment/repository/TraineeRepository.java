package com.example.womenempowerment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.womenempowerment.entity.Trainee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.womenempowerment.entity.Trainee;

public interface TraineeRepository extends JpaRepository<Trainee, Integer>{
	
	@Query("select tr from Trainee tr where tr.location=:loc")
	List<Trainee> viewAllTraineesByLocation(@Param("loc")String location);
	
	@Query("select tr from Trainee tr where tr.aadharNo=:aadharnumber")
	Trainee findByAadharNo(@Param("aadharnumber")long aadharNo);
	
	@Query("select tr from Trainee tr where tr.trainingCourse.trainingCourseId=:cId")
	Trainee deleteByCourseId(@Param("cId") int courseId);
}
