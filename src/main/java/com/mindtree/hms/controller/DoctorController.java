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

import com.mindtree.hms.exception.DoctorNotFound;
import com.mindtree.hms.model.Doctor;
import com.mindtree.hms.repository.DoctorRepository;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {

	@Autowired
	private DoctorRepository dRepo;

	// TODO Getting all doctors

	@GetMapping("/doctors")
	public List<Doctor> getDoctorsList() {
		return dRepo.findAll();
	}

	// TODO Getting specific doctor
	@GetMapping("/doctors/{id}")
	public ResponseEntity<Doctor> getDoctorById(@PathVariable Long id) {
		Doctor doctor = dRepo.findById(id).orElseThrow(() -> new DoctorNotFound("Doctor not exist with id :" + id));
		return ResponseEntity.ok(doctor);

	}
	
	//TODO creating new doctor
	
	@PostMapping("/doctors")
	public Doctor crateNewDoctor(@RequestBody Doctor doctor) {
		return dRepo.save(doctor);
	}



}
