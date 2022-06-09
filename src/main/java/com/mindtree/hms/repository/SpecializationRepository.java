package com.mindtree.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.mindtree.hms.model.Specialization;

public interface SpecializationRepository extends JpaRepository<Specialization, Long> {
	
	@Query("Select s from Specialization s where s.id=?1")
	List<Specialization> getDoctorSpecializations(Long id);
	
	 @Modifying
	    @Query(value = "insert into Specialization (id,area) VALUES (:id,:area)", nativeQuery = true)
	    @Transactional
	String setDoctorSpecialization(@Param("id") Long id, @Param("area")String area);



}
