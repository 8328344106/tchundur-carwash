package com.CarWash.CustomerCarDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CarWash.CustomerCarDetails.Model.CarModel;
import com.CarWash.CustomerCarDetails.Service.CarService;

@RestController
@CrossOrigin("*")
public class CarController 
{
	@Autowired
	private CarService carser;
	
	@GetMapping("/getcardetails")
	public List<CarModel> getdetails()
	{
		return carser.getdetails();
	}
	
	@PostMapping("/addcardetails")
	public CarModel addcardetails(@RequestBody CarModel c) 
	{
		return carser.addcardetails(c);
	}

}
