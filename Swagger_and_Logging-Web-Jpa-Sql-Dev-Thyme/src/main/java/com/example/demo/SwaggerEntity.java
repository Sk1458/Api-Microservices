package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "swaggerTable")
public class SwaggerEntity {
	
	@Id
	@SequenceGenerator(name = "seqGen", sequenceName = "seqGen1", initialValue = 500, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seqGen")
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String branch;
	@Column
	private int marks;
	@Column
	private String college;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	public SwaggerEntity(int id, String name, String branch, int marks, String college) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.marks = marks;
		this.college = college;
	}
	
	public SwaggerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
