package com.example.womenempowerment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="User_Details")
public class User {
	@Id
	int userid;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}$",message="user name should have only letters and numbers and size should be 5")
	String userName;
	
	String userPassword;
	
	String userType;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public void setUserType(String userType) {
		this.userType=userType;
	}
	public String getUserType() {
		return userType;
	}
	public User(int userid, String userName, String userPassword, String userType) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userType=userType;
	}
	public User() {
		super();
	}
}
