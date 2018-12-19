package com.mi.Service;

import java.util.List;

import com.mi.demo.User;
import com.mi.repository.UserRepository;

public class UserServiceImpl implements UserService{
	private UserRepository userRepository;
	
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

}
