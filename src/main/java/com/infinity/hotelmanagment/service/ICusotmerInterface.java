package com.infinity.hotelmanagment.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.infinity.hotelmanagment.model.CustomerModel;

public interface ICusotmerInterface {

	public String addcustomer(CustomerModel customerModel);
}
