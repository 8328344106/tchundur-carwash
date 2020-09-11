package com.CarWash.CarWashAdmin.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.CarWash.CarWashAdmin.Model.WashServicesModel;
import com.CarWash.CarWashAdmin.Service.WashServices;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin("*")
@RequestMapping("/service")
public class WashServicesController 
{
	@Autowired
	private WashServices washser;
	
	@GetMapping("/getservices")
	public List<WashServicesModel> getservices()
	{
		return washser.getservices();
	}

	@GetMapping("/getperticularservice/{id}")
	public WashServicesModel getperticularservice(@PathVariable String id)
	{
		return washser.getperticularservice(id);
	}
	
	@PostMapping("/addservices")
	public WashServicesModel addservice(@RequestParam("wash") String wash,@RequestParam("file") MultipartFile file) throws IOException
	{
		ObjectMapper objectMapper = new ObjectMapper();
		WashServicesModel w = objectMapper.readValue(wash, WashServicesModel.class);
		return washser.addservice(w, file);
	}
	
	@DeleteMapping("/deleteservice/{id}")
	public Boolean deleteservice(@PathVariable String id)
	{
		return washser.deleteservice(id);
	}
}
