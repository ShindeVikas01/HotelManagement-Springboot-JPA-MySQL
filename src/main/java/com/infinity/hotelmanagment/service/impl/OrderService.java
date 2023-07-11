package com.infinity.hotelmanagment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinity.hotelmanagment.entity.OrderEntity;
import com.infinity.hotelmanagment.model.OrderModel;
import com.infinity.hotelmanagment.repo.OrderRepo;
import com.infinity.hotelmanagment.service.IOrderInterface;

@Service
public class OrderService implements IOrderInterface{

	@Autowired
	OrderRepo orderrepo;
	@Override
	public String addorder(OrderModel ordermodel) {

		OrderEntity orderEntity=new OrderEntity();
		orderEntity.setOid(ordermodel.getOid());
		orderEntity.setCid(ordermodel.getCid());
		orderEntity.setOdate(ordermodel.getOdate());
		orderEntity.setOamount(ordermodel.getOamount());
		orderrepo.save(orderEntity);
		return "Data added successfully";
	}
	@Override
	public OrderEntity getorder(int oid) {

		return orderrepo.getOrderEntityByOid(oid);
		
	}
	@Override
	public List<OrderEntity> getallorder() {
		// TODO Auto-generated method stub
		return orderrepo.findAll();
	}
	
	
}
