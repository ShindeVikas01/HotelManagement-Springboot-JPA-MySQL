package com.infinity.hotelmanagment.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infinity.hotelmanagment.entity.OrderEntity;
import com.infinity.hotelmanagment.model.OrderModel;
import com.infinity.hotelmanagment.service.IOrderInterface;



@RestController
@RequestMapping("/hotelmanagement/order")
public class OrderControler {

	@Autowired
	IOrderInterface orderserv;
	@PostMapping("/addorder")
	public String addorder(@RequestBody OrderModel ordermodel) {
		
		return orderserv.addorder(ordermodel);
	}
	@GetMapping("/getorder/{oid}")
	public OrderEntity getorder(@PathVariable("oid") int oid) {
		return orderserv.getorder(oid);
	}
	@GetMapping("/getallorder")
	public ResponseEntity<List<OrderEntity>> getallorder(){
		return new ResponseEntity<List<OrderEntity>>(orderserv.getallorder(),HttpStatus.ACCEPTED);
	}
}
