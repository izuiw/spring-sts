package com.example.msa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@GetMapping("/{customerId}")
	public String getCustomerDetail(@PathVariable String customerId) {
		
		System.out.println("reeuqest customerId : " + customerId);
		
		//throw new RuntimeException("I/O Exception");
		return "[Customer Id =" + customerId + " at " + System.currentTimeMillis() + "]";
	}
}
