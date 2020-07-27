package com.CarWash.CustomerCarDetails.Service;

import java.util.List;
import java.util.Optional;

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
	
	public boolean deletecar(String id)
	{
		Optional<CarModel> car =  carRepo.findById(id);
		if(car.isPresent())
		{
			carRepo.deleteById(id); 
			return true;
		}
		return false;
	}
	
	public boolean updatecardetails(CarModel car)
	{
		Optional<CarModel> available = carRepo.findById(car.getId());
		if(available.isPresent()) 
		{
			carRepo.save(car);
			return true;
		}
		return false;
	}
}
