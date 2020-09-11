package com.CarWash.CustomerRegister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerRegisterApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CustomerRegisterApplication.class, args);
	}

}
