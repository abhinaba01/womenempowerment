package com.example.womenempowerment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.womenempowerment.entity.NGO;

public interface NGORepository extends JpaRepository<NGO, Integer>{
	
	@Query("select ngo from NGO ngo where ngo.ngoMotive=:mo")
	public List<NGO> viewNGOByMotive(@Param("mo") String motive);
	
	
	@Query("select ngo from NGO ngo where ngo.ngoLocation=:lo")
	public List<NGO> viewNGOByLocation(@Param("lo") String location);
}
