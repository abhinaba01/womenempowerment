package com.example.womenempowerment.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.example.womenempowerment.entity.Scheme;
import com.example.womenempowerment.exception.SchemeAlreadyExistsException;
import com.example.womenempowerment.exception.SchemeDoesNotExistsException;

public interface SchemeService {
	Scheme addScheme(Scheme scheme) throws SchemeAlreadyExistsException;
	
	Scheme updateScheme(Scheme scheme);
	
	Optional<Scheme> viewScheme(int schemeId) throws SchemeDoesNotExistsException;
	
	List<Scheme> viewAllScheme();
	
	void deleteScheme(int schemeId) throws SchemeDoesNotExistsException;
	
	List<Scheme> viewSchemeByType(String schemeType) throws SchemeDoesNotExistsException;

	List<Scheme> viewSchemeByLaunchDate(LocalDate date) throws SchemeDoesNotExistsException;
}
