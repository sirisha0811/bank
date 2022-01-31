package com.example.demo.service;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BalanceEnquiry;
import com.example.demo.repository.BalanceEnquiryRepository;
@Service
public class BalanceEnquiryService {
	@Autowired
	BalanceEnquiryRepository balanceenquiryRepository;
	
	public Iterable<BalanceEnquiry> getBalanceEnquirys() {
		return  balanceenquiryRepository.findAll();
	}

	public void saveBalanceEnquiry(@Valid BalanceEnquiry balanceenquiry) {
		balanceenquiryRepository.save(balanceenquiry);
		
	}
}
