package com.mi.repository;

import java.util.List;

import com.mi.demo.User;

public interface UserRepository {
	public List<User> findAll();
}
