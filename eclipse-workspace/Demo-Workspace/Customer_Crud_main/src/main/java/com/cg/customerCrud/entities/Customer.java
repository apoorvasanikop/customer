package com.cg.customerCrud.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cust_tbl")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "fname")
	@NotNull
	@Size(min = 2, message = "First Name should have mininum 2 characters!!")
	private String firstName;
	@Column(name = "lname")
	@NotNull
	@Size(min = 2, message = "Last Name should have mininum 2 characters!!")
	private String lastName;
	@Column(name = "email")
	@Email(message = "Enter a valid email address!!")
	private String email;
	private String address;
	@Column(name = "mob")
//	@Pattern(regexp = "[9-7]{9}")
	private long mobile;

	@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cp_fk", referencedColumnName = "id")
	private List<Product> products;

}