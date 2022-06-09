package com.mindtree.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mindtree.hms.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{

}
