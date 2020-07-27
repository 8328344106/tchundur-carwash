package com.CarWash.CustomerCarDetails.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LocationModel 
{

	private String name;
	private String doornumber;
	private String street;
	private String landmark;
	private String dist;
	private String state;
	private String pincode;
	
	public LocationModel(String name, String doornumber, String street, String landmark, String dist, String state,
			String pincode) {
		super();
		this.name = name;
		this.doornumber = doornumber;
		this.street = street;
		this.landmark = landmark;
		this.dist = dist;
		this.state = state;
		this.pincode = pincode;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDoornumber() {
		return doornumber;
	}
	public void setDoornumber(String doornumber) {
		this.doornumber = doornumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "LocationModel [name=" + name + ", doornumber=" + doornumber + ", street=" + street + ", landmark="
				+ landmark + ", dist=" + dist + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
}
