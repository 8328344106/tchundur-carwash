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

import com.CarWash.CustomerCarDetails.Model.SheduleModel;
import com.CarWash.CustomerCarDetails.Service.SheduleService;

@RestController
@CrossOrigin("*")
@RequestMapping("/shedule")
public class SheduleController 
{
	@Autowired
	SheduleService sheservice;
	
	@GetMapping("/getshedule")
	public List<SheduleModel> allshedule()
	{
		return sheservice.allshedule();
	}
	
	@PostMapping("/addshedule")
	public SheduleModel addshedule(@RequestBody SheduleModel s)
	{
		return sheservice.addshedule(s);
	}
	
	@DeleteMapping("/deleteshedule/{id}")
	public boolean deleteshedule(@PathVariable String id)
	{
		return sheservice.deleteshedule(id);
	}
}
