package com.mindtree.hms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Appoinment")
@Table(name = "appoinment_info")

public class Appoinment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long appoinment_id;

	@Column(name = "doctor_id")
	private int doctor_id;

	@Column(name = "patient_id")
	private int patient_id;

	public Appoinment() {
		
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public long getAppoinment_id() {
		return appoinment_id;
	}

	
	
	

    

}
