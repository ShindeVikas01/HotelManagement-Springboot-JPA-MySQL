package com.infinity.hotelmanagment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinity.hotelmanagment.entity.CustomerEntity;
import com.infinity.hotelmanagment.model.CustomerModel;
import com.infinity.hotelmanagment.repo.CustomerRepo;
import com.infinity.hotelmanagment.service.ICusotmerInterface;

@Service
public class CustomerService implements ICusotmerInterface {

	@Autowired
	CustomerRepo customerrepo;
	@Override
	public String addcustomer(CustomerModel customerModel) {
		CustomerEntity customerentity=new CustomerEntity();
		customerentity.setCid(customerModel.getCid());
		customerentity.setCname(customerModel.getCname());
		customerentity.setMobnum(customerModel.getMobnum());
		customerentity.setEid(customerModel.getEid());
		customerrepo.save(customerentity);
		return "Data added successfully....";
	}

}
