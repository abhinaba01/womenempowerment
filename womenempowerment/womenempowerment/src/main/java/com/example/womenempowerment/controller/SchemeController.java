package com.example.womenempowerment.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.womenempowerment.entity.Scheme;
import com.example.womenempowerment.exception.SchemeAlreadyExistsException;
import com.example.womenempowerment.exception.SchemeDoesNotExistsException;
import com.example.womenempowerment.service.SchemeService;

@RestController
public class SchemeController {
	@Autowired
	private SchemeService schemeServ;
	
	@PostMapping("/scheme")
	public ResponseEntity<Scheme> addScheme(@RequestBody Scheme scheme) throws SchemeAlreadyExistsException{
		Scheme sc = schemeServ.addScheme(scheme);
		return new ResponseEntity<Scheme>(sc,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/updatescheme")
	public ResponseEntity<Scheme> updateScheme(@RequestBody Scheme scheme){
		Scheme updatescheme = schemeServ.updateScheme(scheme);
		return new ResponseEntity<Scheme>(updatescheme,HttpStatus.OK);
	}
	
	@GetMapping("/scheme/{schemeId}")
	public ResponseEntity<Optional<Scheme>> viewSchemeById(@PathVariable int schemeId) throws SchemeDoesNotExistsException{
		Optional<Scheme> viewById = schemeServ.viewScheme(schemeId);
		if(!viewById.isEmpty()) {
			return new ResponseEntity<Optional<Scheme>>(viewById,HttpStatus.OK);
		}
		else {
			throw new SchemeDoesNotExistsException();
		}
	}
	
	@GetMapping("/schemes")
	public ResponseEntity<List<Scheme>> viewAllScheme(){
		List<Scheme> viewAll = schemeServ.viewAllScheme();
		return new ResponseEntity<List<Scheme>>(viewAll,HttpStatus.OK);
	}
	
	@DeleteMapping("/scheme/{schemeId}")
	public ResponseEntity<String> deleteScheme(@PathVariable int schemeId) throws SchemeDoesNotExistsException{
		Optional<Scheme> viewById = schemeServ.viewScheme(schemeId);
		if(!viewById.isEmpty()) {
			schemeServ.deleteScheme(schemeId);
			return new ResponseEntity<String>("Deleted successfully",HttpStatus.OK);
		}
		else{
			throw new SchemeDoesNotExistsException();
		}
	}
	
	@GetMapping("/viewschemebytype/{schemeType}")
	public ResponseEntity<List<Scheme>> viewSchemesByType(@PathVariable String schemeType) throws SchemeDoesNotExistsException{
		if(schemeServ.viewSchemeByType(schemeType) != null) {
			List<Scheme> viewSchemeByType = schemeServ.viewSchemeByType(schemeType);
			return new ResponseEntity<List<Scheme>>(viewSchemeByType,HttpStatus.OK);
		}
		else {
			throw new SchemeDoesNotExistsException();
		}
	}

    @GetMapping("/viewschemebydate/{date}")
	public ResponseEntity<List<Scheme>> viewSchemesByLaunchDate(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)@PathVariable LocalDate date) throws SchemeDoesNotExistsException{
		if(schemeServ.viewSchemeByLaunchDate(date) != null) {
			List<Scheme> viewSchemeByLaunchDate = schemeServ.viewSchemeByLaunchDate(date);
			return new ResponseEntity<List<Scheme>>(viewSchemeByLaunchDate,HttpStatus.OK);
		}
		else {
			throw new SchemeDoesNotExistsException();
		}
	}
}
