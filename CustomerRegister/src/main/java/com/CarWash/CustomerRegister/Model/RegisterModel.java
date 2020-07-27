package com.CarWash.CustomerRegister.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RegisterModel 
{
	@Id
	private String id;
	private String username;
	private String email;
	private Integer mobilenumber;
	private String password;
	

	public RegisterModel(String id, String username, String email, Integer mobilenumber, String password) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(Integer mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "RegisterModel [id=" + id + ", username=" + username + ", email=" + email + ", mobilenumber="
				+ mobilenumber + ", password=" + password + "]";
	}
	

}
