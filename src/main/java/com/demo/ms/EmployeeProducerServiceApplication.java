package com.demo.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.demo.ms"})
@EnableDiscoveryClient
@EnableCircuitBreaker
public class EmployeeProducerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProducerServiceApplication.class, args);
	}
}
