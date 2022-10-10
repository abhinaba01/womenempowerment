package com.example.womenempowerment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.womenempowerment.entity.NGO;
import com.example.womenempowerment.exception.NGOAlreadyExistsException;
import com.example.womenempowerment.exception.NGODoesNotExistsException;
import com.example.womenempowerment.repository.NGORepository;

@Service
public class NGOServiceImpl implements NGOService{
	
	@Autowired
	private NGORepository NGORepo;
	
	@Override
	public NGO addNGO(NGO ngo) throws NGOAlreadyExistsException {
		if(NGORepo.existsById(ngo.getNgoId())) {
			throw new NGOAlreadyExistsException();
		}
		else {
			NGO addNgo = NGORepo.save(ngo);
			return addNgo;
		}
	}
	
	@Override
	public NGO updateNGO(NGO ngo) {
		NGO updatengo = NGORepo.save(ngo);
		return updatengo;
	}
	
	@Override
	public Optional<NGO> viewNGO(int ngoid) throws NGODoesNotExistsException{
		Optional<NGO> viewById = NGORepo.findById(ngoid);
		return viewById;
	}

	@Override
	public List<NGO> viewAllNGO() {
		List<NGO> viewallngo = NGORepo.findAll();
		return viewallngo;
	}

	@Override
	public void deleteNGO(int ngoId) throws NGODoesNotExistsException{
		NGORepo.deleteById(ngoId);
	}

	@Override
	public List<NGO> viewNGOByMotive(String motive) throws NGODoesNotExistsException{
		List<NGO> viewbymotive = NGORepo.viewNGOByMotive(motive);
		return viewbymotive;
	}

	@Override
	public List<NGO> viewNGOByLocation(String location) throws NGODoesNotExistsException {
		List<NGO> viewbylocation = NGORepo.viewNGOByLocation(location);
		return viewbylocation;
	}

}
