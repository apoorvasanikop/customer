package com.cg.customerCrud.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "prod_tbl")
public class Product {
	
	@Id
	private int pid;
	private String pName;
	private int qty;
	private int price;
	
	

}
