package com.infinity.hotelmanagment.service;

import com.infinity.hotelmanagment.entity.OrderEntity;
import com.infinity.hotelmanagment.model.OrderModel;

public interface IOrderInterface {

	public String addorder(OrderModel ordermodel);
	public OrderEntity getorder(int sid);
}
