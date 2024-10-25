package com.example.demo;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cse_id_gen")
public class CseCustumEntity2 {
	
	@Id
	@Column
	@GenericGenerator(name = "cseId", type = AimlSequence.class)
	@GeneratedValue(generator = "cseId")
	private String id;
	@Column
	private String name;
	@Column
	private String branch;
	@Column
	private int marks;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	

}
