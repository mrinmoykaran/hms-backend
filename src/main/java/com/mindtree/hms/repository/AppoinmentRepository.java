package com.mindtree.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mindtree.hms.model.Appoinment;
import com.mindtree.hms.model.Specialization;

public interface AppoinmentRepository extends JpaRepository<Appoinment, Long> {
	
	@Query("Select count(s) from Appoinment s where s.doctor_id=:doctor_id")
	int getApoinmentCount(@Param("doctor_id") int doctor_id);
	

	
}
