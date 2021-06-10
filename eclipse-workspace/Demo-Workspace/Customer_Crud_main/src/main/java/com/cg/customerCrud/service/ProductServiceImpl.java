package com.cg.customerCrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.customerCrud.dto.OrderRequest;
import com.cg.customerCrud.entities.Customer;
import com.cg.customerCrud.repository.ProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductRepository productRepository;

	
	@Override
	
	public Customer placeOrder(OrderRequest request) {

		return null;
	}



	

}
