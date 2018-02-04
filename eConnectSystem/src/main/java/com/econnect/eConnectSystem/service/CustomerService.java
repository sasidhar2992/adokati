package com.econnect.eConnectSystem.service;

import org.springframework.scheduling.config.Task;

import com.econnect.eConnectSystem.model.Customer;

public interface CustomerService {
	Iterable<Customer> list();
	
	Customer save(Customer customer);
}
