package com.CarWash.CustomerCarDetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarWash.CustomerCarDetails.Model.CarModel;
import com.CarWash.CustomerCarDetails.Repository.CarRepository;

@Service
public class CarService 
{

	@Autowired
	private CarRepository carRepo;
	
	public List<CarModel> getdetails()
	{
		return carRepo.findAll();
	}
	
	public CarModel addcardetails(CarModel c) 
	{
		return carRepo.save(c);
	}
}
