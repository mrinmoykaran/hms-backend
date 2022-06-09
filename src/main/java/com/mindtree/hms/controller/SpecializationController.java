package com.mindtree.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.hms.model.Specialization;
import com.mindtree.hms.repository.SpecializationRepository;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class SpecializationController 
{

	@Autowired
	private SpecializationRepository sRepo;
	
	// TODO Getting doctor names
		@GetMapping("specialization/{id}")
		public List<Specialization> getDoctorSpecializations(@PathVariable Long id)
		{
			return sRepo.getDoctorSpecializations(id);
		}
		
		@PostMapping("specialization/{id}/{specialization}")
		public String setDoctorSpecialization(@PathVariable Long doc_id,@PathVariable String specialization)
		{
			return specialization;
		}
		
	
}
