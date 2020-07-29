package com.example.CarwashGateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarWashGatewayConfigaration 
{
	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder)
	{
		return builder.routes()
				.route(r -> r.path("/customerregister/**")
						.uri("http://localhost:9999/")
						.id("customerregister"))
				.route(r -> r.path("/car/**")
						.uri("http://localhost:9898/")
						.id("customercar"))
				.route(r -> r.path("/shedule/**")
						.uri("http://localhost:9898/")
						.id("customercar"))
				.route(r -> r.path("/payment/**")
						.uri("http://localhost:9898/")
						.id("customercar"))
				.build();
		
	}

}
