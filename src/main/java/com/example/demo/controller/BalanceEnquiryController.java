package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.entity.BalanceEnquiry;
import com.example.demo.service.BalanceEnquiryService;

public class BalanceEnquiryController {
	@Autowired
	 BalanceEnquiryService balanceenquiryService;
	
	@GetMapping("/balanceenquiry")
	Iterable< BalanceEnquiry> getBalanceEnquiry() {
	      return balanceenquiryService.getBalanceEnquirys();
	 }
	
	@PostMapping("/balanceenquiry")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createBalanceEnquiry(@RequestBody @Valid  BalanceEnquiry balanceenquiry) {
		balanceenquiryService.saveBalanceEnquiry(balanceenquiry);
	}

}
