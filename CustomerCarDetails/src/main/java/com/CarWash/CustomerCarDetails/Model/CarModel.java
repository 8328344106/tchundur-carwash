package com.CarWash.CustomerCarDetails.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CarModel 
{
	
	@Id
	private String username;
	private String carname;
	private String cartype;
	private String image;
	
	public CarModel(String username, String carname, String cartype, String image) 
	{
		super();
		this.username = username;
		this.carname = carname;
		this.cartype = cartype;
		this.image = image;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
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
		return "CarModel [username=" + username + ", carname=" + carname + ", cartype=" + cartype + ", image=" + image
				+ "]";
	}
	
	
}
