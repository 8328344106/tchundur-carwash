package com.CarWash.CustomerRegister.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarWash.CustomerRegister.Model.RegisterModel;
import com.CarWash.CustomerRegister.Repository.RegisterRepository;

@Service
public class RegisterService 
{
	
	@Autowired
	private RegisterRepository Repo;
	
	public List<RegisterModel> getcustomer() {
		return Repo.findAll();
	}
	
	public RegisterModel addcustomer(RegisterModel c) {
		return Repo.save(c);
	}
	
	public boolean loginValidate(RegisterModel customer) 
	{
		
		List<RegisterModel> all=Repo.findAll();
		for (RegisterModel l: all)
		{
			if(l.getUsername().contentEquals(customer.getUsername())&&l.getPassword().contentEquals(customer.getPassword()))
			{
				return true;
			}
		}
		return false;
		
		
	}
	
	public boolean deleteuser(String id) 
	{
		Optional<RegisterModel> reg=Repo.findById(id);
		if(reg.isPresent()) 
		{
			Repo.deleteById(id);
			return true;
		}
		return false;
	}

}
