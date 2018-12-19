package com.mi.repository;

import java.util.ArrayList;
import java.util.List;

import com.mi.demo.User;

public class JdbcUserRepositoryImpl implements UserRepository{

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<>();
		users.add(new User(111,"Gafoor","9704921520", "gafoor@gmail.com"));
		return users;
	}

}
