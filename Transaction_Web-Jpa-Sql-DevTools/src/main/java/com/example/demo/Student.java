package com.example.demo;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_transaction")
public class Student {
	
	@Id
	@Column
	@SequenceGenerator(name = "stuSeq", sequenceName = "stuSeq1", initialValue = 501, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "stuSeq")
	private int id;
	@Column
	private String name;
	@Column
	private String branch;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addessId")
	private Address address;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
