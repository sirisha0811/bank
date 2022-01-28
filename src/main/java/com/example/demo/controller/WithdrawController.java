package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Withdraw;
import com.example.demo.service.WithdrawService;
@RestController
public class WithdrawController {
	@Autowired
	 WithdrawService withdrawService;
	@GetMapping("/withdraw")
	Iterable<Withdraw> getWithdraw() {
	      return withdrawService.getWithdraws();
	 }
	
	@PostMapping("/withdraw")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createWithdraw(@RequestBody @Valid Withdraw withdraw) {
		withdrawService.saveWithdraw(withdraw);
	}

}
