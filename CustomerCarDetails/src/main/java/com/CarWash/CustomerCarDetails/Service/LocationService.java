package com.CarWash.CustomerCarDetails.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarWash.CustomerCarDetails.Model.LocationModel;
import com.CarWash.CustomerCarDetails.Repository.LocationRepository;

@Service
public class LocationService 
{
	@Autowired
	private LocationRepository locRepo;
	
	public List<LocationModel> getalllocation()
	{
		return locRepo.findAll();
	}
	
	public List<LocationModel> getbyuser(String user)
	{
		List<LocationModel> byuser = new ArrayList<LocationModel>();
		List<LocationModel> all = locRepo.findAll();
		for( LocationModel l: all)
		{
			if(l.getUsername().contentEquals(user))
			{
				byuser.add(l);
			}
		}
		return byuser;
	}
	
	public LocationModel getlocationbyuser(String id)
	{
		List<LocationModel> all = locRepo.findAll();
		for( LocationModel l: all)
		{
			if(l.getId().contentEquals(id))
			{
				return l;
			}
		}
		return null;
	}
	
	public LocationModel addlocation(LocationModel loc)
	{
		return locRepo.save(loc);
		
	}
	
	public LocationModel editlocation(LocationModel loc)
	{
		List<LocationModel> all = locRepo.findAll();
		for(LocationModel l: all)
		{
			if(l.getId().contentEquals(loc.getId()))
			{
				return locRepo.save(loc);
			}
		}
		return null;
	}
	
	public boolean deletelocation(String id)
	{
		Optional<LocationModel> loc = locRepo.findById(id);
		if(loc.isPresent())
		{
			locRepo.deleteById(id);
			return true;
		}
		return false;
	}
}
