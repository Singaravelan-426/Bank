package com.example.Bank.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Bank.Dao.BankDao;
import com.example.Bank.Entity.Bank;

@Service
public class BankService {
	@Autowired
	
	BankDao bankDao;
	public String getAddBank(Bank b) {
		return bankDao.getAddBank(b);
		
	}

	public String getIfsc(String s1,String s2) {
	    return bankDao.getIfsc(s1,s2);
	}

	public List<Bank> getall() {
		
		return bankDao.getall();
	}
}
