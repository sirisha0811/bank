package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BalanceEnquiry;



@Repository
public interface BalanceEnquiryRepository extends CrudRepository<BalanceEnquiry, Integer> {

}