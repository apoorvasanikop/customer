package com.cg.customerCrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.customerCrud.dto.OrderResponse;
import com.cg.customerCrud.entities.Customer;
import com.cg.customerCrud.exception.CustomerNotFoundException;

@Service
public interface ICustomerService {

	Customer addCustomer(Customer customer);

	List<Customer> fetchAll();

	void delCustomer(int id) throws CustomerNotFoundException;

	void updateCustomer(Customer customer);

	Customer fetchById(int id) throws CustomerNotFoundException;

	Customer getByLastName(String lastName);

	Customer getByFirstName(String firstName);

	public List<OrderResponse> getJoinInfo();

}

