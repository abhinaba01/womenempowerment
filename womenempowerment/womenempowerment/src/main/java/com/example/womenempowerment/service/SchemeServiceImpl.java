package com.example.womenempowerment.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.womenempowerment.entity.Scheme;
import com.example.womenempowerment.exception.SchemeAlreadyExistsException;
import com.example.womenempowerment.exception.SchemeDoesNotExistsException;
import com.example.womenempowerment.repository.SchemeRepository;

@Service
public class SchemeServiceImpl implements SchemeService{
	@Autowired
	private SchemeRepository SchemeRepo;
	
	@Override
	public Scheme addScheme(Scheme scheme) throws SchemeAlreadyExistsException{
		if(SchemeRepo.existsById(scheme.getSchemeId())) {
			throw new SchemeAlreadyExistsException();
		}
		else {
			Scheme sc = SchemeRepo.save(scheme);
			return sc;			
		}
	}
	
	@Override
	public Scheme updateScheme(Scheme scheme) {
		Scheme sc = SchemeRepo.save(scheme);
		return sc;
	}

	@Override
	public Optional<Scheme> viewScheme(int schemeId) throws SchemeDoesNotExistsException{
		Optional<Scheme> viewScheme = SchemeRepo.findById(schemeId);
		return viewScheme;
	}

	@Override
	public List<Scheme> viewAllScheme() {
		List<Scheme> viewAll = SchemeRepo.findAll();
		return viewAll;
	}
	
	@Override
	public void deleteScheme(int schemeId) throws SchemeDoesNotExistsException{
		SchemeRepo.deleteById(schemeId);
	}

	@Override
	public List<Scheme> viewSchemeByType(String schemeType) throws SchemeDoesNotExistsException{
		List<Scheme> viewScByType = SchemeRepo.viewSchemesByType(schemeType);
		return viewScByType;
	}

    @Override
	public List<Scheme> viewSchemeByLaunchDate(LocalDate date) throws SchemeDoesNotExistsException{
		List<Scheme> viewScBydate = SchemeRepo.viewSchemeByLaunchDate(date);
		return viewScBydate;
	}
}
