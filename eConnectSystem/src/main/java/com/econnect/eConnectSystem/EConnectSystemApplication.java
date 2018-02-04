package com.econnect.eConnectSystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.econnect.eConnectSystem.service.CustomerService;

@SpringBootApplication
public class EConnectSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EConnectSystemApplication.class, args);
	}
	
	/*@Bean
	CommandLineRunner runner(CustomerService customerService) {
		return args -> {
			customerService.save(new Customer())
		}
		
	}*/
}
