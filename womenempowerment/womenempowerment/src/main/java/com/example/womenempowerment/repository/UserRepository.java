package com.example.womenempowerment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.womenempowerment.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("select u from User u where u.userName=:un")
	public User findByUserName(@Param("un")String username);
	
	@Query("select u from User u where u.userPassword=:pa")
	public User findByUserPassword(@Param("pa")String password);
	
	@Query("select u from User u where u.userType=:type")
	public User findByUserType(@Param("type")String userType);
}
