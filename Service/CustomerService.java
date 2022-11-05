package com.example.Customer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Customer.Dao.CustomerDao;
import com.example.Customer.Entity.Customer;

@Service
public class CustomerService {
	@Autowired
	CustomerDao cusDao;
	public String setCustomer(Customer c) {
		return cusDao.setCustomer(c);
	}
}
