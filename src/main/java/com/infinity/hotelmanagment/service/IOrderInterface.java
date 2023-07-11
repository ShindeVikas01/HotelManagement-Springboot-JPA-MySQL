package com.infinity.hotelmanagment.service;

import java.util.List;

import com.infinity.hotelmanagment.entity.OrderEntity;
import com.infinity.hotelmanagment.model.OrderModel;


public interface IOrderInterface {

	public String addorder(OrderModel ordermodel);
	public OrderEntity getorder(int sid);
	public List<OrderEntity> getallorder();
}
