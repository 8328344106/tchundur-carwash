package com.CarWash.CustomerCarDetails.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarWash.CustomerCarDetails.Model.PaymentModel;
import com.CarWash.CustomerCarDetails.Model.SheduleModel;
import com.CarWash.CustomerCarDetails.Repository.SheduleRepository;

@Service
public class SheduleService 
{
	@Autowired
	SheduleRepository sheRepo;
	
	public List<SheduleModel> allshedule()
	{
		
		return sheRepo.findAll();
	}
	
	
	public SheduleModel addshedule(SheduleModel s)
	{
		return sheRepo.save(s);
	}
	
	
	
	public boolean deleteshedule(String id) 
	{
		Optional<SheduleModel> sh= sheRepo.findById(id);
		if(sh.isPresent()) {
			sheRepo.deleteById(id);
			return true;
		}
		return false;
	}
}
