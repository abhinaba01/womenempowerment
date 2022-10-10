package com.example.womenempowerment.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="NGO")
public class NGO {
	@Id
	@Column(name="NGO_ID")
	private int ngoId;
	
	@Column(name="NGO_Name")
	private String ngoName;
	
	@Column(name="NGO_Location")
	private String ngoLocation;
	
	@Column(name="NGO_Type")
	private String ngoType;
	
	@Column(name="NGO_Motive")
	private String ngoMotive;
	
	@Column(name="Donation")
	private double donation;
	
	@Column(name="NGO_Size")
	private int ngoSize;
	
	@Column(name="NGO_Activities")
	private String ngoActivities;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="trainingCourseId")
	private TrainingCourse trainingCourse;
	
	public int getNgoId() {
		return ngoId;
	}
	public void setNgoId(int ngoId) {
		this.ngoId = ngoId;
	}
	public String getNgoName() {
		return ngoName;
	}
	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}
	public String getNgoLocation() {
		return ngoLocation;
	}
	public void setNgoLocation(String ngoLocation) {
		this.ngoLocation = ngoLocation;
	}
	public String getNgoType() {
		return ngoType;
	}
	public void setNgoType(String ngoType) {
		this.ngoType = ngoType;
	}
	public String getNgoMotive() {
		return ngoMotive;
	}
	public void setNgoMotive(String ngoMotive) {
		this.ngoMotive = ngoMotive;
	}
	public double getDonation() {
		return donation;
	}
	public void setDonation(double donation) {
		this.donation = donation;
	}
	public int getNgoSize() {
		return ngoSize;
	}
	public void setNgoSize(int ngoSize) {
		this.ngoSize = ngoSize;
	}
	public String getNgoActivities() {
		return ngoActivities;
	}
	public void setNgoActivities(String ngoActivities) {
		this.ngoActivities = ngoActivities;
	}
	public TrainingCourse getTrainingCourse() {
		return trainingCourse;
	}
	public void setTrainingCourse(TrainingCourse trainingCourse) {
		this.trainingCourse = trainingCourse;
	}
	public NGO(int ngoId, String ngoName, String ngoLocation, String ngoType, String ngoMotive, double donation,
			int ngoSize, String ngoActivities, TrainingCourse trainingCourse) {
		super();
		this.ngoId = ngoId;
		this.ngoName = ngoName;
		this.ngoLocation = ngoLocation;
		this.ngoType = ngoType;
		this.ngoMotive = ngoMotive;
		this.donation = donation;
		this.ngoSize = ngoSize;
		this.ngoActivities = ngoActivities;
		this.trainingCourse = trainingCourse;
	}
	
	public NGO() {
		super();
	}
}
