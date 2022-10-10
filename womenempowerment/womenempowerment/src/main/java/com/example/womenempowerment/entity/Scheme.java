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
@Table(name="Scheme")
public class Scheme {
	@Id
	@Column(name="scheme_ID")
	private int schemeId;
	
	@Column(name="scheme_Name")
	private String schemeName;
	
	@Column(name="scheme_Type")
	private String schemeType;
	
	@Column(name="scheme_LaunchDate")
	private LocalDate schemeLaunchDate;
	
	@Column(name="scheme_Eligibility")
	private String schemeEligibility;
	
	@Column(name="scheme_Objective")
	private String schemeObjective;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="scheme_training")
	private TrainingCourse training;
	
	public int getSchemeId() {
		return schemeId;
	}
	public void setSchemeId(int scId) {
		this.schemeId = scId;
	}
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String scName) {
		this.schemeName = scName;
	}
	public String getSchemeType() {
		return schemeType;
	}
	public void setSchemeType(String scType) {
		this.schemeType = scType;
	}
	
	public LocalDate getSchemeLaunchDate() {
		return schemeLaunchDate;
	}
	public void setSchemeLaunchDate(LocalDate scDate) {
		this.schemeLaunchDate = scDate;
	}
	public String getSchemeEligibility() {
		return schemeEligibility;
	}
	public void setSchemeEligibility(String scEli) {
		this.schemeEligibility = scEli;
	}
	public String getSchemeObjective() {
		return schemeObjective;
	}
	public void setSchemeObjective(String scObj) {
		this.schemeObjective = scObj;
	}
	
	public TrainingCourse getTraining() {
		return training;
	}
	public void setTraining(TrainingCourse tc) {
		this.training = tc;
	}
	public Scheme(int scId, String scName, String scType,LocalDate dat, String scElig,
			String scOb, TrainingCourse trc) {
		super();
		this.schemeId = scId;
		this.schemeName = scName;
		this.schemeType = scType;
		this.schemeLaunchDate = dat;
		this.schemeEligibility = scElig;
		this.schemeObjective = scOb;
		this.training = trc;
	}
	
	public Scheme() {
		super();
	}
}
