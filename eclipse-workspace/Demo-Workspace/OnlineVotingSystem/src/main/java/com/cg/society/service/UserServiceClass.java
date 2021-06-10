package com.cg.society.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.society.dto.UserResponse;
import com.cg.society.entities.User;
import com.cg.society.exceptions.UserNotFoundException;
import com.cg.society.repository.UserRepository;
import com.cg.society.service.UserServiceClass;

@Service
public class UserServiceClass implements UserService {

	Logger logger = LoggerFactory.getLogger(UserServiceClass.class);

	@Autowired
	private UserRepository repository;

	@Override
	public void updateUser(User user) {

		logger.info("inside registerUser method of UserService");
		repository.save(user);
	}

	@Override
	public void deleteUser(int userId) throws UserNotFoundException {
		Optional<User> user = repository.findById(userId);
		if (!user.isPresent())
			throw new UserNotFoundException();

		repository.deleteById(userId);
	}

	@Override
	public List<User> viewUserList() {

		return repository.findAll();
	}

	@Override
	public User findByUserId(int userId) throws UserNotFoundException {
		Optional<User> user = repository.findById(userId);
		if (!user.isPresent())
			throw new UserNotFoundException();

		return user.get();
	}

	@Override
	public List<User> fetchAll() {

		return repository.findAll();
	}

	@Override
	public List<User> findAll() {

		return repository.findAll();
	}

	

}
