package com.mindtree.hms.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.hms.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

	
	

	
	

}
