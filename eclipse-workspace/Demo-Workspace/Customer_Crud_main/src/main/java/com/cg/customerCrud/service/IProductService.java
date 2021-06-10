package com.cg.customerCrud.service;

import com.cg.customerCrud.dto.OrderRequest;
import com.cg.customerCrud.entities.Customer;

public interface IProductService {

	

	Customer placeOrder(OrderRequest request);

	
	
}
