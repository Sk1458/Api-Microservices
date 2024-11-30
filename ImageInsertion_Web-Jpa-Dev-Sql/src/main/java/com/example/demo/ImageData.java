package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "imageData")
public class ImageData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String descp;
	@Column(length = 65555) //this value of length says that the image size being saved is of medium size
	@Lob
	private byte[] image;
	
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
	
	public String getDesc() {
		return descp;
	}
	public void setDesc(String descp) {
		this.descp = descp;
	}
	
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	public ImageData(int id, String name, String descp, byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.descp = descp;
		this.image = image;
	}
	
	public ImageData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
