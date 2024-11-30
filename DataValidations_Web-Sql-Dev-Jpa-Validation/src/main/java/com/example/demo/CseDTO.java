package com.example.demo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class CseDTO {
	
	@NotBlank
	private String name;
	private String branch;
	@Email(message = "enter a valid email")
	@CustomEmailAnnotation
	private String email;
	@Min(65)
	private int marks;
	
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public CseDTO(String name, String branch, String email, int marks) {
		super();
		this.name = name;
		this.branch = branch;
		this.email = email;
		this.marks = marks;
	}
	
	public CseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
}
