package com.econnect.eConnectSystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.econnect.eConnectSystem.model.Customer;
import com.econnect.eConnectSystem.service.CustomerService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	private CustomerService customerService;
	
	
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}


	@GetMapping(value = {"","/"})
	public Iterable<Customer> listCustomers() {
		return this.customerService.list();
		
	}
	
	@PostMapping("/save")
	public Customer saveTask(@RequestBody Customer customer) {
		return this.customerService.save(customer);
		
	}
}
