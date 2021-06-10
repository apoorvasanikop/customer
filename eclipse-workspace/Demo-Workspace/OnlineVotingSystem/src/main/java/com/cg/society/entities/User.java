package com.cg.society.entities;

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

import com.cg.society.entities.User;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user_table")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	@Column(name = "pass")
	@NotNull
	@Size(min = 6, message = "Password should have mininum 2 characters!!")
	private String password;
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
	@Column(name = "mob")
	private String contactno;
	
	
	
	
	

}
