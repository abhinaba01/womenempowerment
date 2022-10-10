package com.example.womenempowerment.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;

import com.example.womenempowerment.entity.Scheme;

public interface SchemeRepository extends JpaRepository<Scheme, Integer>{
	@Query("select scheme from Scheme scheme where scheme.schemeType=:st")
	public List<Scheme> viewSchemesByType(@Param("st") String schemeType );
	
	
	@Query("select scheme from Scheme scheme where scheme.schemeLaunchDate=:date")
	public List<Scheme> viewSchemeByLaunchDate(@Param("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date);
}
