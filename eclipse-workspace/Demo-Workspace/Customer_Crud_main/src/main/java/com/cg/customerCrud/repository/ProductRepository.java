package com.cg.customerCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.customerCrud.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
