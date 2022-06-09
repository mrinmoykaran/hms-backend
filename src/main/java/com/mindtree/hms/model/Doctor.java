package com.mindtree.hms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Doctor")
@Table(name = "doctors_info")

public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "full_name")
	private String full_name;

	@Column(name = "age")
	private int age;

	@Column(name = "gender")
	private String gender;
	
	@Column(name = "specialization")
	private String specialization;
	
	
	
	
	
	
	
	

	public Doctor() {
		
	}



	public Doctor(String full_name, int age, String gender) {
		super();
		this.full_name = full_name;
		this.age = age;
		this.gender = gender;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getSpecialization() {
		return specialization;
	}



	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	



	

	

}
