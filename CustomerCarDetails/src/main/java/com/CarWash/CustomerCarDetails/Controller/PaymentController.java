package com.CarWash.CustomerCarDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CarWash.CustomerCarDetails.Model.PaymentModel;
import com.CarWash.CustomerCarDetails.Service.PaymentService;

@RestController
@CrossOrigin("*")
@RequestMapping("/payment")
public class PaymentController 
{
	@Autowired
	private PaymentService payservice;
	
	@GetMapping("/getpayment")
	public List<PaymentModel> getallpayment()
	{
		return payservice.getallpayment();
	}
	
	@GetMapping("/getpaymentbyuser/{user}")
	public List<PaymentModel> getpaymentbyuser(@PathVariable String user)
	{
		return payservice.getpaymentbyuser(user);
	}
	
	@GetMapping("/getpaymentbyid/{id}")
	public PaymentModel getpaymentbyid(@PathVariable String id)
	{
		return payservice.getpaymentbyid(id);
	}
	
	@PostMapping("/addpayment")
	public PaymentModel addpayment(@RequestBody PaymentModel p)
	{
		return payservice.addpayment(p);
	}
	
	@DeleteMapping("/deletecard/{id}")
	public boolean deletecard(@PathVariable String id )
	{
		payservice.deletecard(id);
		return true;
	}
}
