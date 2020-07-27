package com.CarWash.CustomerCarDetails.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SheduleModel 
{
	
	@Id
	private String id;
	private String username;
	private CarModel cardetails;
	private String date;
	private String time;
	private LocationModel location;
	
	public SheduleModel(String username, CarModel cardetails, String date, String time, LocationModel location) {
		super();
		this.username = username;
		this.cardetails = cardetails;
		this.date = date;
		this.time = time;
		this.location = location;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public CarModel getCardetails() {
		return cardetails;
	}

	public void setCardetails(CarModel cardetails) {
		this.cardetails = cardetails;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public LocationModel getLocation() {
		return location;
	}

	public void setLocation(LocationModel location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "SheduleModel [username=" + username + ", cardetails=" + cardetails + ", date=" + date + ", time=" + time
				+ ", location=" + location + "]";
	}
	

}
