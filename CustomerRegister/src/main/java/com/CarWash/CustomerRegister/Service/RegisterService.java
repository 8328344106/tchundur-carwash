package com.CarWash.CustomerRegister.Service;

import java.util.ArrayList;
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
	
	public List<RegisterModel> getcustomer() 
	{
		return Repo.findAll();
	}
	
	public RegisterModel getperticularuser(String id)
	{
		List<RegisterModel> all = Repo.findAll();
		for(RegisterModel r : all)
		{
			if(r.getId().contentEquals(id))
			{
				return r;
			}
		}
		
		return null;
	}
	
	public List<RegisterModel> getbyrole(String r)
	{
		List<RegisterModel> all =Repo.findAll();
		List<RegisterModel> byrole = new ArrayList<RegisterModel>();
		for(RegisterModel l : all)
		{
			if(l.getRole().contentEquals(r))
			{
				byrole.add(l);
			}
		}
		return byrole;
	}
	
	public RegisterModel addcustomer(RegisterModel c) 
	{
		
		List<RegisterModel> all= Repo.findAll();
		for(RegisterModel l : all)
		{
			if(l.getUsername().contentEquals(c.getUsername()))
			{
				return null;
			}
		}
		return Repo.save(c);
	}
	
	public RegisterModel loginValidate(RegisterModel customer) 
	{
		
		List<RegisterModel> all=Repo.findAll();
		for (RegisterModel l: all)
		{
			if(l.getUsername().contentEquals(customer.getUsername())&&l.getPassword().contentEquals(customer.getPassword()))
			{
				return l;
			}
		}
		return null;
			
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
	
	public RegisterModel updateuser(RegisterModel c)
	{
		List<RegisterModel> all = Repo.findAll();
		for(RegisterModel r: all) 
		{
			if(r.getId().contentEquals(c.getId()))
			{
				return Repo.save(c);
			}
		}
		return null;
	}
}
