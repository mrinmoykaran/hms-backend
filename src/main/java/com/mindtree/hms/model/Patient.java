package com.mindtree.hms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patients_info")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "full_name")
	private String full_name;
	
	@Column(name = "visited_doctor")
	private String visited_doctor;
	
	@Column(name = "date_of_visit")
	private String date_of_visit;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "prescriptionUrl")
	private String prescriptionUrl;
	
	
	
	
	

	public Patient() {
		
	}

	public Patient(String full_name, String visited_doctor, String date_of_visit,int age) {
		super();
		this.full_name = full_name;
		this.visited_doctor = visited_doctor;
		this.date_of_visit = date_of_visit;
		this.age=age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getVisited_doctor() {
		return visited_doctor;
	}

	public void setVisited_doctor(String visited_doctor) {
		this.visited_doctor = visited_doctor;
	}

	public String getDate_of_visit() {
		return date_of_visit;
	}

	public void setDate_of_visit(String date_of_visit) {
		this.date_of_visit = date_of_visit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPrescriptionUrl() {
		return prescriptionUrl;
	}

	public void setPrescriptionUrl(String prescriptionUrl) {
		this.prescriptionUrl = prescriptionUrl;
	}

	
	
	
	
	
	
	
	
	
	

}
