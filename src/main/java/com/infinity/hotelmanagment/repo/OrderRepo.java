package com.infinity.hotelmanagment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infinity.hotelmanagment.entity.OrderEntity;

public interface OrderRepo extends JpaRepository<OrderEntity, Integer> {

	public OrderEntity getOrderEntityByOid(int oid);
}
