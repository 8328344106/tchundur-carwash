package com.CarWash.CustomerCarDetails.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PaymentModel 
{
	@Id
	private String id;
	private String username;
	private String cardholdername;
	private long cardnumber;
	private Integer expmon;
	private Integer expyear;
	private Integer cvv;
	
	public PaymentModel(String id, String username, String cardholdername, long cardnumber, Integer expmon,
			Integer expyear, Integer cvv) {
		super();
		this.id = id;
		this.username = username;
		this.cardholdername = cardholdername;
		this.cardnumber = cardnumber;
		this.expmon = expmon;
		this.expyear = expyear;
		this.cvv = cvv;
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

	public String getCardholdername() {
		return cardholdername;
	}

	public void setCardholdername(String cardholdername) {
		this.cardholdername = cardholdername;
	}

	public long getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}

	public Integer getExpmon() {
		return expmon;
	}

	public void setExpmon(Integer expmon) {
		this.expmon = expmon;
	}

	public Integer getExpyear() {
		return expyear;
	}

	public void setExpyear(Integer expyear) {
		this.expyear = expyear;
	}

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "PaymentModel [id=" + id + ", username=" + username + ", cardholdername=" + cardholdername
				+ ", cardnumber=" + cardnumber + ", expmon=" + expmon + ", expyear=" + expyear + ", cvv=" + cvv + "]";
	}
	
	

}
