package com.infinity.hotelmanagment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infinity.hotelmanagment.entity.CustomerEntity;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Integer> {

}
