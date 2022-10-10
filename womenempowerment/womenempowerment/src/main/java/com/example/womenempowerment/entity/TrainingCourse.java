package com.example.womenempowerment.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Training_Course")
public class TrainingCourse {
	@Id
	@Column(name="Training_course_ID")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int trainingCourseId;
	
	@Column(name="Course_Name")
	private String courseName;
	
	@Column(name="Course_Duration")
	private String courseDuration;
	
	@Column(name="Starting_Date")
	private LocalDate startingDate;
	
	@Column(name="Ending_Date")
	private LocalDate endingDate;
	
	@Column(name="Course_completion_status")
	private String courseCompletionStatus;
	
	public int getTrainingCourseId() {
		return trainingCourseId;
	}
	public void setTrainingCourseId(int trainingCourseId) {
		this.trainingCourseId = trainingCourseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public LocalDate getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}
	public LocalDate getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(LocalDate endingDate) {
		this.endingDate = endingDate;
	}
	public String getCourseCompletionStatus() {
		return courseCompletionStatus;
	}
	public void setCourseCompletionStatus(String courseCompletionStatus) {
		this.courseCompletionStatus = courseCompletionStatus;
	}
	public TrainingCourse(int trainingCourseId, String courseName, String courseDuration, LocalDate startingDate,
			LocalDate endingDate, String courseCompletionStatus) {
		super();
		this.trainingCourseId = trainingCourseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
		this.courseCompletionStatus = courseCompletionStatus;
	}
	
	public TrainingCourse() {
		super();
	}
}
