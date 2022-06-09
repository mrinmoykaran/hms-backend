package com.mindtree.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.hms.exception.PatientNotFound;
import com.mindtree.hms.model.Patient;
import com.mindtree.hms.repository.PatientRepository;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {
	
	@Autowired
	private PatientRepository pRepo;
	
	//TODO Getting all doctors
		@GetMapping("/patients")
		public List<Patient> getPatientList()
		{
			return pRepo.findAll();
		}
		
		//TODO Getting specific doctor
		@GetMapping("/patients/{id}")
		public ResponseEntity<Patient> getPatientById(@PathVariable Long id) {
			Patient patient = pRepo.findById(id)
					.orElseThrow(() -> new PatientNotFound("Patient not exist with id :" + id));
			return ResponseEntity.ok(patient);
			
		}
		
		//TODO creating new patient
		
		@PostMapping("/patients")
		public Patient crateNewDoctor(@RequestBody Patient patient) {
			return pRepo.save(patient);
		}


}
