package com.CarWash.CustomerCarDetails.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarWash.CustomerCarDetails.Model.CarModel;
import com.CarWash.CustomerCarDetails.Model.PaymentModel;
import com.CarWash.CustomerCarDetails.Repository.PaymentRepository;

@Service
public class PaymentService 
{
	@Autowired
	private PaymentRepository payRepo;
	
	public List<PaymentModel> getallpayment()
	{
		return payRepo.findAll();
	}
	
	public PaymentModel addpayment(PaymentModel p) 
	{
		return payRepo.save(p);
	}
	
	public void deletecard(String id)
	{
		payRepo.deleteById(id);
	}
	
	public boolean updatepayment(PaymentModel pay)
	{
		Optional<PaymentModel> available = payRepo.findById(pay.getId());
		if(available.isPresent()) 
		{
			payRepo.save(pay);
			return true;
		}
		return false;
	}
}
