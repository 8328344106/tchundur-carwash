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
	private String carId;
	private String cartype;
	private String image;
	
	
	public CarModel(String id, String username, String brand, String carId, String cartype, String image) {
		super();
		this.id = id;
		this.username = username;
		this.brand = brand;
		this.carId = carId;
		this.cartype = cartype;
		this.image = image;
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
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "CarModel [id=" + id + ", username=" + username + ", brand=" + brand + ", carId=" + carId + ", cartype="
				+ cartype + ", image=" + image + "]";
	}	
	
	
}
