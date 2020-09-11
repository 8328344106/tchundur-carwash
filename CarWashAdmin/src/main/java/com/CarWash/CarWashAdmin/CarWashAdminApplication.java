package com.CarWash.CarWashAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CarWashAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarWashAdminApplication.class, args);
	}

}
