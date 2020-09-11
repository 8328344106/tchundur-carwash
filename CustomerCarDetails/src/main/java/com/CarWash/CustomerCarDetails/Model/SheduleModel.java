package com.CarWash.CustomerCarDetails.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SheduleModel 
{
	
	@Id
	private String id;
	private String username;
    private String washername;
    private WashServicesModel servicedetails;
    private CarModel cardetails;
    private LocationModel locationdetails;
    private PaymentModel paymentdetails;
    private String bookeddate;
    private String sheduledate;
    private String sheduletime;
    private String washeraccepteddate;
    private Integer servicetax;
    private Integer totalamount;
    private long transactionid;
    private long bookingid;
    private String status;
    private Integer rating;
    private String review;
	
	public SheduleModel(String id, String username, String washername, WashServicesModel servicedetails,
			CarModel cardetails, LocationModel locationdetails, PaymentModel paymentdetails, String bookeddate,
			String sheduledate, String sheduletime, String washeraccepteddate, Integer servicetax, Integer totalamount,
			long transactionid, long bookingid, String status, Integer rating, String review) {
		super();
		this.id = id;
		this.username = username;
		this.washername = washername;
		this.servicedetails = servicedetails;
		this.cardetails = cardetails;
		this.locationdetails = locationdetails;
		this.paymentdetails = paymentdetails;
		this.bookeddate = bookeddate;
		this.sheduledate = sheduledate;
		this.sheduletime = sheduletime;
		this.washeraccepteddate = washeraccepteddate;
		this.servicetax = servicetax;
		this.totalamount = totalamount;
		this.transactionid = transactionid;
		this.bookingid = bookingid;
		this.status = status;
		this.rating = rating;
		this.review = review;
	}

	
	public Integer getRating() {
		return rating;
	}


	public void setRating(Integer rating) {
		this.rating = rating;
	}


	public String getReview() {
		return review;
	}


	public void setReview(String review) {
		this.review = review;
	}


	public long getTransactionid() {
		return transactionid;
	}


	public void setTransactionid(long transactionid) {
		this.transactionid = transactionid;
	}


	public long getBookingid() {
		return bookingid;
	}


	public void setBookingid(long bookingid) {
		this.bookingid = bookingid;
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
	public String getWashername() {
		return washername;
	}
	public void setWashername(String washername) {
		this.washername = washername;
	}
	
	public WashServicesModel getServicedetails() {
		return servicedetails;
	}


	public void setServicedetails(WashServicesModel servicedetails) {
		this.servicedetails = servicedetails;
	}


	public CarModel getCardetails() {
		return cardetails;
	}
	public void setCardetails(CarModel cardetails) {
		this.cardetails = cardetails;
	}
	public LocationModel getLocationdetails() {
		return locationdetails;
	}
	public void setLocationdetails(LocationModel locationdetails) {
		this.locationdetails = locationdetails;
	}
	public PaymentModel getPaymentdetails() {
		return paymentdetails;
	}
	public void setPaymentdetails(PaymentModel paymentdetails) {
		this.paymentdetails = paymentdetails;
	}
	public String getBookeddate() {
		return bookeddate;
	}
	public void setBookeddate(String bookeddate) {
		this.bookeddate = bookeddate;
	}
	public String getSheduledate() {
		return sheduledate;
	}
	public void setSheduledate(String sheduledate) {
		this.sheduledate = sheduledate;
	}
	public String getSheduletime() {
		return sheduletime;
	}
	public void setSheduletime(String sheduletime) {
		this.sheduletime = sheduletime;
	}
	public String getWasheraccepteddate() {
		return washeraccepteddate;
	}
	public void setWasheraccepteddate(String washeraccepteddate) {
		this.washeraccepteddate = washeraccepteddate;
	}
	public Integer getServicetax() {
		return servicetax;
	}
	public void setServicetax(Integer servicetax) {
		this.servicetax = servicetax;
	}
	public Integer getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(Integer totalamount) {
		this.totalamount = totalamount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "SheduleModel [id=" + id + ", username=" + username + ", washername=" + washername + ", servicedetails="
				+ servicedetails + ", cardetails=" + cardetails + ", locationdetails=" + locationdetails
				+ ", paymentdetails=" + paymentdetails + ", bookeddate=" + bookeddate + ", sheduledate=" + sheduledate
				+ ", sheduletime=" + sheduletime + ", washeraccepteddate=" + washeraccepteddate + ", servicetax="
				+ servicetax + ", totalamount=" + totalamount + ", transactionid=" + transactionid + ", bookingid="
				+ bookingid + ", status=" + status + ", rating=" + rating + ", review=" + review + "]";
	}

	
}
