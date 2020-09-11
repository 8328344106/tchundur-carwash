package com.CarWash.CustomerRegister.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CarWash.CustomerRegister.Model.RegisterModel;
import com.CarWash.CustomerRegister.Service.RegisterService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/customer")
public class RegisterController 
{
	
	@Autowired
	private RegisterService cuservice;
	
	@GetMapping("/getcustomer")
	public List<RegisterModel> getcustomer() {
		
		return cuservice.getcustomer();
	}
	
	@GetMapping("/getperticularuser/{id}")
	public RegisterModel getperticularuser(@PathVariable String id)
	{
		return cuservice.getperticularuser(id);
	}
	
	@GetMapping("/getbyrole/{role}")
	public List<RegisterModel> getbyrole(@PathVariable String role)
	{
		return cuservice.getbyrole(role);
	}
	
	@PostMapping("/register")
	public RegisterModel addcustomer(@RequestBody RegisterModel c) 
	{
		return cuservice.addcustomer(c);
	}
	
	@PostMapping("/edituser")
	public RegisterModel updateuser(@RequestBody RegisterModel c)
	{
		return cuservice.updateuser(c);
	}
	
	@PostMapping("/login")
	public RegisterModel loginValidate(@RequestBody RegisterModel customer) 
	{
		return cuservice.loginValidate(customer);
		
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public boolean deleteuser(@PathVariable String id)
	{
		return cuservice.deleteuser(id);
	}

}
