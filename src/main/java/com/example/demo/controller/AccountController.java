package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	 AccountService accountService;
	@GetMapping("/account")
	Iterable<Account> getAccounts() {
	      return accountService.getAccounts();
	 }
	
	@PostMapping("/account")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createAccount(@RequestBody @Valid Account account) {
		accountService.saveAccount(account);
	}

}
