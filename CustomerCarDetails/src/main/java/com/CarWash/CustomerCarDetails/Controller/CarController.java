package com.CarWash.CustomerCarDetails.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.ByteArrayResource;

import com.CarWash.CustomerCarDetails.Model.CarModel;
import com.CarWash.CustomerCarDetails.Repository.CarRepository;
import com.CarWash.CustomerCarDetails.Service.CarService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin("*")
@RequestMapping("/car")
public class CarController 
{
	@Autowired
	private CarService carser;
	
	@Autowired
	private CarRepository carRepo;

	
	@GetMapping("/getcardetails")
	public List<CarModel> getdetails()
	{
		return carser.getdetails();
	}
	
	@GetMapping("/getbyuser/{user}")
	public List<CarModel> getbyuser(@PathVariable String user)
	{
		return carser.getbyuser(user);
	}
	
	@GetMapping("/getcarbyid/{id}")
	public CarModel getcarbyid(@PathVariable String id)
	{
		return carser.getcarbyid(id);
	}
	
	@PostMapping("/addfiledetails")
	public CarModel addfiledetails(@RequestParam("car") String car,@RequestParam("file") MultipartFile file) throws IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		CarModel c = objectMapper.readValue(car, CarModel.class);
		System.out.println(c);
		return carser.addfiledetails(c, file);
	}
	
	@GetMapping(value= "/getimage/{id}")
	public CarModel getcarimage(@PathVariable String id) {
		
	   return carser.getcarimage(id);
	}
	
	@GetMapping("/getimages/{id}")
	public byte[] getimage(@PathVariable String id)
	{
		byte[] document = null;
		String encodess=null;
		String image = null;
		List<CarModel> allCer=carRepo.findAll();
		for(CarModel c:allCer)
		{
			if(c.getId().contentEquals(id))
			{
				return c.getImage();
			}
		}
		return document;
	}
	
	@GetMapping("/DownloadImage/{id}")
	public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable String id) 
	{
		return carser.downloadFile(id);
	}
	
			
	@DeleteMapping("/deletecar/{id}")
	public boolean deletecardetails(@PathVariable String id)
	{
		return carser.deletecar(id);
	}
	
	@PutMapping("/updatecar")
	public boolean updatecar(@RequestBody CarModel c)
	{
		return carser.updatecardetails(c);
	}
}
