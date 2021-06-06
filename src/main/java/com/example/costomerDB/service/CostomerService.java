package com.example.costomerDB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.costomerDB.model.CostomerDB;
import com.example.costomerDB.repository.CustomerRepository;

@Service
public class CostomerService {

	@Autowired
	CustomerRepository customerRepository;
	public Object getCustomer() {
		return customerRepository.findAll();
		
	}
	public Object addCustomer(CostomerDB costomerDB) {
		customerRepository.save(costomerDB);
		return"record saved";
	}

}
