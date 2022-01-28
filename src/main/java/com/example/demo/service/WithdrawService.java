package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Withdraw;
import com.example.demo.repository.WithdrawRepository;
@Service
public class WithdrawService {
	@Autowired
    WithdrawRepository withdrawRepository;
	
	public void saveWithdraw(@Valid Withdraw withdraw) {
		withdrawRepository.save(withdraw);
		
	}

	public Iterable<Withdraw> getWithdraws() {
	
		return  withdrawRepository.findAll();
	}

}
