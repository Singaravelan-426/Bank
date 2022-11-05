package com.example.Bank.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Bank.Entity.Bank;
import com.example.Bank.Repository.BankRepository;
@Repository
public class BankDao {
	@Autowired
	BankRepository bankRepo;
	public String getAddBank(Bank b) {
		bankRepo.save(b);
		return "Saved";
	}
	public String getIfsc(String s1,String s2) {
	    return bankRepo.getIfscCode(s1, s2);
	}
}
