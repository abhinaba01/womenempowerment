package com.example.womenempowerment.service;

import java.util.List;
import java.util.Optional;

import com.example.womenempowerment.entity.NGO;
import com.example.womenempowerment.exception.NGOAlreadyExistsException;
import com.example.womenempowerment.exception.NGODoesNotExistsException;

public interface NGOService {
	
	NGO addNGO(NGO ngo) throws NGOAlreadyExistsException;
	
	NGO updateNGO(NGO ngo);
	
	Optional<NGO> viewNGO(int ngoid) throws NGODoesNotExistsException;
	
	List<NGO> viewAllNGO();
	
	void deleteNGO(int ngoId) throws NGODoesNotExistsException;
	
	List<NGO> viewNGOByMotive(String motive) throws NGODoesNotExistsException;
	
	List<NGO> viewNGOByLocation(String location) throws NGODoesNotExistsException;
}
