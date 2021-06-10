package com.cg.customerCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.customerCrud.dto.OrderRequest;
import com.cg.customerCrud.entities.Customer;
import com.cg.customerCrud.service.CustomerServiceImpl;
import com.cg.customerCrud.service.ProductServiceImpl;

@RestController
@RequestMapping("products")
public class ProductController {
	
	
	@Autowired
	private ProductServiceImpl productService;
	
	@Autowired
	private CustomerServiceImpl customerService;
	
	
	@PostMapping("placeOrder")
	public Customer saveOrder(@RequestBody  OrderRequest order) {
		
	return	customerService.addCustomer(order.getCustomer());

	}

	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders() {
		return customerService.fetchAll();
	}
}
