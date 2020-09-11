package com.CarWash.CarWashAdmin.Model;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class WashServicesModel 
{

	@Id
	private String id;
	private String servicename;
	private String description;
	private Integer amount;
	private String imagename;
	private byte[] image;


	public WashServicesModel(String id, String servicename, String description, Integer amount, String imagename,
			byte[] image) {
		super();
		this.id = id;
		this.servicename = servicename;
		this.description = description;
		this.amount = amount;
		this.imagename = imagename;
		this.image = image;
	}


	
	public WashServicesModel() 
	{
		
	}



	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}


	public String getImagename() {
		return imagename;
	}


	public void setImagename(String imagename) {
		this.imagename = imagename;
	}
	
		
}
