package com.cg.society.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.society.dto.UserResponse;
import com.cg.society.entities.User;
import com.cg.society.exceptions.UserNotFoundException;

@Service
public interface UserService {
	
	static User registerUser(User user) {
		return user;
		// TODO Auto-generated method stub
		
	}
	
	List<User> fetchAll();
	
	void updateUser(User user);
	
	void deleteUser(int userId) throws UserNotFoundException;
	
	public List<User> viewUserList();
	
	 User findByUserId(int userId) throws UserNotFoundException;
	 
	 List<User> findAll();

	//List<UserResponse> getJoinInfo();
}

