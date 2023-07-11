package com.infinity.hotelmanagment.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.infinity.hotelmanagment.model.CustomerModel;
import com.infinity.hotelmanagment.service.ICusotmerInterface;

@RestController
@RequestMapping("/hotelmanagement/customer")
public class CustomerControler {
	
	@Autowired
	ICusotmerInterface icustomer;
	@GetMapping("/home")
	public String home() {
		return "Welcome Customer";
	}
	
	@PostMapping("/addcustomer")
	public String addcustomer(@RequestBody CustomerModel customerModel) {
		
		return icustomer.addcustomer(customerModel);
	}

}
