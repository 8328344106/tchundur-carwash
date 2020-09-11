package com.CarWash.CarWashAdmin.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.CarWash.CarWashAdmin.Model.WashServicesModel;
import com.CarWash.CarWashAdmin.Repository.WashServicesRepository;

@Service
public class WashServices 
{
	
	@Autowired
	private WashServicesRepository serRepo;
	
	public List<WashServicesModel> getservices()
	{
		return serRepo.findAll();
	}
	
	public WashServicesModel getperticularservice(String id)
	{
		List<WashServicesModel> per = serRepo.findAll();
		for(WashServicesModel p: per)
		{
			if(p.getId().contentEquals(id))
			{
				return p;
			}
		}
		return null;
	}
	
	
	public WashServicesModel addservice(WashServicesModel w,MultipartFile file) throws IOException
	{
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());   
		w.setImage(file.getBytes());
		w.setImagename(fileName);
		List<WashServicesModel> all= serRepo.findAll();
		for(WashServicesModel l : all)
		{
			if(l.getServicename().contentEquals(w.getServicename()))
			{
				return null;
			}
		}
		return serRepo.save(w);
	}
	
	public Boolean deleteservice(String id)
	{
		List<WashServicesModel> all = serRepo.findAll();
		for( WashServicesModel l: all)
		{
			if(l.getId().contentEquals(id))
			{
				serRepo.deleteById(id);
				return true;
			}
		}
		return false;
	}
}
