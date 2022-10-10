package com.example.womenempowerment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.womenempowerment.entity.Feedback;
import com.example.womenempowerment.entity.NGO;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{
	@Query("select feedback from Feedback feedback where feedback.scheme.schemeName=:sn")
	public List<Feedback> viewFeedBackBySchemeName(@Param("sn") String feedback);
	
	@Query("select feedback from Feedback feedback where feedback.training.courseName=:tcn")
	public List<Feedback> viewFeedBackByTrainingCourseNameName(@Param("tcn") String feedback);
}
