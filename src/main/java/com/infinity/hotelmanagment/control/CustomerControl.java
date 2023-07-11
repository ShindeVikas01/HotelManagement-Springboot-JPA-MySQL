package com.infinity.hotelmanagment.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotelmanagement/customer")
public class CustomerControl {
	
	@GetMapping("/home")
	public String home() {
		return "Welcome Customer";
	}

}
