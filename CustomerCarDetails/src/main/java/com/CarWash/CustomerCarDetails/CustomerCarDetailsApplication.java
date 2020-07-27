package com.CarWash.CustomerCarDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerCarDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerCarDetailsApplication.class, args);
	}

}
