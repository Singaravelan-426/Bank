package com.example.Customer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.Customer.Entity.Customer;
import com.example.Customer.Service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	
	CustomerService cusSer;
	
	
	@PostMapping(value="/addcustomer")
	public String setCustomer(@RequestBody Customer c) {
		
		
		return cusSer.setCustomer(c);
	}
	

}
