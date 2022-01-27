package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;
@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Pattern(regexp ="^savings?$|^current?$")
	@NotBlank
	private String acctype;
	@OneToOne(mappedBy = "account")
	Customer customer;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public Integer getInitialdeposit() {
		return initialdeposit;
	}
	public void setInitialdeposit(Integer initialdeposit) {
		this.initialdeposit = initialdeposit;
	}
	@Range(min = 500)
	private Integer initialdeposit;

}
