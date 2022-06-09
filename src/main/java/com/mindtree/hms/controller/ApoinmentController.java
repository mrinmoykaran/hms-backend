package com.mindtree.hms.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.hms.model.Appoinment;
import com.mindtree.hms.repository.AppoinmentRepository;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class ApoinmentController 
{

	@Autowired
	private AppoinmentRepository aRepo;
	
	// TODO Getting doctor names
		@GetMapping("appoinment/{id}")
		public int getApoinmentCount(@PathVariable int id)
		{
			return aRepo.getApoinmentCount(id);
		}
		
		@PostMapping("/appoinment")
		public Appoinment crateNewDoctor(@RequestBody Appoinment appoinment) {
			return aRepo.save(appoinment);
		}
		
		
		
	
}
