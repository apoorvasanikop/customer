package com.cg.society.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.society.entities.User;
import com.cg.society.exceptions.UserNotFoundException;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	/*
	 * public int registerUser(User user);
	 * 
	 * public int updateUser(User user) throws UserNotFoundException;
	 * 
	 * public List<User> viewUserList();
	 * 
	 * public Optional<User> findByUserId(int userId) throws UserNotFoundException;
	 * 
	 * public void deleteByUserId(int userId);
	 * 
	 * public List<User> findAll();
	 */


}
