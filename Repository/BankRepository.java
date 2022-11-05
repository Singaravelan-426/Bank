package com.example.Bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Bank.Entity.Bank;



public interface BankRepository extends JpaRepository<Bank, Integer> {
	@Query(value="SELECT ifsc FROM bank.bank where name=:a AND branch=:b",nativeQuery = true)
public String getIfscCode(@Param("a")String a, @Param("b")String b);
}
