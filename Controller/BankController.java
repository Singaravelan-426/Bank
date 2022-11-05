package com.example.Bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bank.Entity.Bank;
import com.example.Bank.Service.BankService;

@RestController
public class BankController {
@Autowired
BankService bankSer;

@PostMapping(value="addbank")
public String getAddBank(@RequestBody Bank b) {
	return bankSer.getAddBank(b);
	}

@GetMapping(value="findifsc/{s1}/{s2}")
public String getIfsc(@PathVariable String s1,@PathVariable String s2) {
    return bankSer.getIfsc(s1,s2);
}
@GetMapping(value="/getall")
public List<Bank> getall() {
	return bankSer.getall();
}

}
