package com.example.Customer.Dao;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.Customer.Entity.Customer;
import com.example.Customer.Repository.CustomerRepository;

@Repository
public class CustomerDao {
	@Autowired
	RestTemplate retemp;
	@Autowired
	CustomerRepository cusRpo;
	

	public String setCustomer(Customer c) {
		String url1="http://localhost:8083/findifsc/ /";
		String bname=c.getBankName();
		String brname=c.getBranch();
		ResponseEntity<String> response=retemp.exchange(url1+bname+"/"+brname,HttpMethod.GET,null,String.class);
		String ifsc1=response.getBody();
		c.setIfsc(ifsc1);
		 cusRpo.save(c);
		 return "saved";
	}

}
