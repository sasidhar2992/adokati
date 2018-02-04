package com.econnect.eConnectSystem.service;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.econnect.eConnectSystem.model.Customer;
import com.econnect.eConnectSystem.repository.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}



	@Override
	public Iterable<Customer> list() {
		
		return this.customerRepository.findAll();
	}



	@Override
	public Customer save(Customer customer) {
		
		return this.customerRepository.save(customer);
	}

	
	
}
