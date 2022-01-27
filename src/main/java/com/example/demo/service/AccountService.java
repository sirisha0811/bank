package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
    AccountRepository accountRepository;

	public Iterable<Account> getAccounts() {
		return accountRepository.findAll();
	}

	public void saveAccount(@Valid Account account) {
		accountRepository.save(account);
		
	}

	
	

}
