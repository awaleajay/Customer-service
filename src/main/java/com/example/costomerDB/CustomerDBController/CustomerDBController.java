package com.example.costomerDB.CustomerDBController;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.costomerDB.model.CostomerDB;
import com.example.costomerDB.service.CostomerService;

import net.bytebuddy.asm.Advice.This;

@RestController
@RequestMapping("/customer")
public class CustomerDBController {
	
	@Autowired
	CostomerService customerservice;
	 
	private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/getCostomer")
	public Object getCostomer() {
		
		@SuppressWarnings("Unchecked")
		List<CostomerDB> customers = (List<CostomerDB>)  customerservice.getCustomer();
		logger.info("Customers"+customers);
		return customers;
		
	}
	@PostMapping("/addCostomer")
	@SuppressWarnings("Unchecked")
	public Object addCustomer(@RequestBody CostomerDB costomerDB) {
		
		logger.info(costomerDB.toString()+"Product added");
		return customerservice.addCustomer(costomerDB);
		
	}
	

}
