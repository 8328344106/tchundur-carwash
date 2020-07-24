package com.CarWash.CustomerRegister.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CarWash.CustomerRegister.Model.RegisterModel;
import com.CarWash.CustomerRegister.Service.RegisterService;

@RestController
@CrossOrigin("*")
public class RegisterController 
{
	
	@Autowired
	private RegisterService cuservice;
	
	@GetMapping("/getcustomer")
	public List<RegisterModel> getcustomer() {
		
		return cuservice.getcustomer();
	}
	
	@PostMapping("/register")
	public RegisterModel addcustomer(@RequestBody RegisterModel c) {
		System.out.println(c);
		return cuservice.addcustomer(c);
	}
	
	@PostMapping("/login")
	public RegisterModel loginValidate(@RequestBody RegisterModel customer) {
		System.out.println(customer);
		return cuservice.loginValidate(customer);
		
	}

}
