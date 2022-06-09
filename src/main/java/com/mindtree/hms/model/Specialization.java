package com.mindtree.hms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity(name="Specialization")
@Table(name = "specialization_info")
@IdClass(SKey.class)
public class Specialization {
	
	@Id
	private Long id;
	
	@Id
	private String area;

	public Specialization() {
		
	}

	public Specialization(Long id, String area) {
		super();
		this.id = id;
		this.area = area;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
}
