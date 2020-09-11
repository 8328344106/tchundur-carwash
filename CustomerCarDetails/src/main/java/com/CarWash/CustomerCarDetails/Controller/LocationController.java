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
import org.springframework.web.bind.annotation.RestController;

import com.CarWash.CustomerCarDetails.Model.LocationModel;
import com.CarWash.CustomerCarDetails.Service.LocationService;

@RestController
@CrossOrigin("*")
@RequestMapping("/locations")
public class LocationController {
	
	@Autowired
	private LocationService locser;
	
	@GetMapping("/getalllocation")
	public List<LocationModel> getalllocation()
	{
		return locser.getalllocation();
	}
	
	@GetMapping("/getbyuser/{user}")
	public List<LocationModel> getbyuser(@PathVariable String user)
	{
		return locser.getbyuser(user);
	}
	
	@GetMapping("/getlocationbyid/{id}")
	public LocationModel getlocationbyid(@PathVariable String id)
	{
		return locser.getlocationbyuser(id);
	}
	
	@PostMapping("/addlocations")
	public LocationModel addlocation(@RequestBody LocationModel loc)
	{
		return locser.addlocation(loc);
	}
	
	@PostMapping("/editlocations")
	public LocationModel editlocation(@RequestBody LocationModel loc)
	{
		return locser.editlocation(loc);
	}
	
	@DeleteMapping("/deletelocations/{id}")
	public boolean deletelocation(@PathVariable String id)
	{
		return locser.deletelocation(id);
	}
}
