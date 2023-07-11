package com.infinity.hotelmanagment.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.infinity.hotelmanagment.entity.CustomerEntity;
import com.infinity.hotelmanagment.model.CustomerModel;

public interface ICusotmerInterface {

	public String addcustomer(CustomerModel customerModel);
	public List<CustomerEntity> getallcustomer();
}
