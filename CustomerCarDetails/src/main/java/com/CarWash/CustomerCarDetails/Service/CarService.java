package com.CarWash.CustomerCarDetails.Service;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.ByteArrayResource;

import com.CarWash.CustomerCarDetails.Model.CarModel;
import com.CarWash.CustomerCarDetails.Repository.CarRepository;
import org.springframework.util.StringUtils;
import org.springframework.http.HttpHeaders;

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
	
	public CarModel getcarimage(String id) {
		byte[] document = null;
		String name=null;
		CarModel car=new CarModel();
		List<CarModel> allCer=carRepo.findAll();
		for(CarModel c:allCer)
		{
			if(c.getId().contentEquals(id))
			{
//				String imagename= c.getImagename();
//				 document=c.getImage();
//				 encodess=Base64.getEncoder().encodeToString(document);		
//				 image="data:image/"+ imagename+";Base64,"+encodess;
				return c;
				// name=c.getImagename()+"_"+c.getImagename();		
			}
		}	
	   return car;
	}
	
	public void addfiledetails(String id,MultipartFile file) throws IOException
	{
		List<CarModel> allCer=carRepo.findAll();
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        System.out.println(fileName);
		for(CarModel c:allCer)
		{
			if(c.getId().contentEquals(id))
			{
				c.setImage(file.getBytes());
				c.setImagename(fileName);
				carRepo.save(c);
			}
		}
	}
	

    public ResponseEntity<ByteArrayResource> downloadFile(String id) 
		{
		System.out.println("hi");
		System.out.println(id);
		byte[] document = null;
		String name=null;
		List<CarModel> allCer=carRepo.findAll();
		for(CarModel c:allCer)
		{
			if(c.getId().contentEquals(id))
			{
				 document=c.getImage();
				 name=c.getImagename()+"_"+c.getImagename();			

			}
		}	
	        return ResponseEntity.ok()
	        		
	                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + name + "\"")
	                .body(new ByteArrayResource(document));
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
