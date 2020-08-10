package com.CarWash.CustomerCarDetails.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CarModel 
{
	
	@Id
	private String id;
	private String username;
	private String brand;
	private String color;
	private String cartype;
	private String imagename;
	private byte[] image;
	
	public CarModel(String id, String username, String brand, String color, String cartype, String imagename,
			byte[] image) {
		super();
		this.id = id;
		this.username = username;
		this.brand = brand;
		this.color = color;
		this.cartype = cartype;
		this.imagename = imagename;
		this.image = image;
	}
	
	public CarModel() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCartype() {
		return cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public String getImagename() {
		return imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

	public byte[] getImage() {
		
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
	
}
