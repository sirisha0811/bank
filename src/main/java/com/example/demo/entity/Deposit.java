package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity

public class Deposit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	
	private Integer accountnum;

	@OneToOne(mappedBy = "deposit")
	Customer customer;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAccountnum() {
		return accountnum;
	}

	public void setAccountnum(Integer accountnum) {
		this.accountnum = accountnum;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	private Integer amount;

	private String description;
	

}
