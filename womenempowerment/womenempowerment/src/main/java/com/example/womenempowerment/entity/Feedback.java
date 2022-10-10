package com.example.womenempowerment.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Feedback {
	@Id
	@Column(name="Fedback_ID")
	int feedbackId;
	
	int schemeRating,schemeTrainingRating,overallRating;
	String comments;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="User_ID")
	User user;
	LocalDate feedbackdate;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Training_Course_ID")
	TrainingCourse training;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Scheme_ID")
	Scheme scheme;
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedback(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public int getSchemeRating() {
		return schemeRating;
	}
	public void setSchemeRating(int schemeRating) {
		this.schemeRating = schemeRating;
	}
	public int getSchemeTrainingRating() {
		return schemeTrainingRating;
	}
	public void setSchemeTrainingRating(int schemeTrainingRating) {
		this.schemeTrainingRating = schemeTrainingRating;
	}
	public int getOverallRating() {
		return overallRating;
	}
	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LocalDate getFeedbackdate() {
		return feedbackdate;
	}
	public void setFeedbackdate(LocalDate feedbackdate) {
		this.feedbackdate = feedbackdate;
	}
	public TrainingCourse getTraining() {
		return training;
	}
	public void setTraining(TrainingCourse training) {
		this.training = training;
	}
	public Scheme getScheme() {
		return scheme;
	}
	public void setScheme(Scheme scheme) {
		this.scheme = scheme;
	}
	public Feedback(int feedbackId, int schemeRating, int schemeTrainingRating, int overallRating, String comments,
			 User user,LocalDate feedbackdate, TrainingCourse training, Scheme scheme) {
		super();
		this.feedbackId = feedbackId;
		this.schemeRating = schemeRating;
		this.schemeTrainingRating = schemeTrainingRating;
		this.overallRating = overallRating;
		this.comments = comments;
		this.user = user;
		this.feedbackdate = feedbackdate;
		this.training = training;
		this.scheme = scheme;
	}
	public Feedback() {
		super();
	}
	
}
