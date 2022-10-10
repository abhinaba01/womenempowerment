package com.example.womenempowerment.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TRAINEE_DETAILS")
public class Trainee {
	@Id
	@Column(name="TRAINEE_ID")
	int traineeId;
	String userName,password,firstName,lastName,email,familyInfo,location;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	long contact,aadharNo;
	LocalDate dob;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="COURSE_ID")
	TrainingCourse trainingCourse;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Feedback_Id")
	Feedback feedBack;
	
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFamilyInfo() {
		return familyInfo;
	}
	public void setFamilyInfo(String familyInfo) {
		this.familyInfo = familyInfo;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public TrainingCourse getTrainingCourse() {
		return trainingCourse;
	}
	public void setTrainingCourse(TrainingCourse trainingCourse) {
		this.trainingCourse = trainingCourse;
	}
	
	public Feedback getFeedBack() {
		return feedBack;
	}
	public void setFeedBack(Feedback feedBack) {
		this.feedBack = feedBack;
	}
	
	public Trainee(int traineeId, String userName, String password, String firstName, String lastName, String email,
			String familyInfo, String location, long contact, long aadharNo, LocalDate dob,
			TrainingCourse trainingCourse, Feedback feedBack) {
		super();
		this.traineeId = traineeId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.familyInfo = familyInfo;
		this.location = location;
		this.contact = contact;
		this.aadharNo = aadharNo;
		this.dob = dob;
		this.trainingCourse = trainingCourse;
		this.feedBack=feedBack;
	}
	public Trainee() {
		super();
	}
}
