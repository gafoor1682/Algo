package com.mi.SpringPepole;

import com.mi.Service.UserServiceImpl;
import com.mi.repository.JdbcUserRepositoryImpl;
import com.mi.repository.UserRepository;

public class ConsoleApplication {

	public static void main(String[] args) {
		
		//part 2
		UserServiceImpl service = new UserServiceImpl();
		
		//part 1 
		UserRepository repository = new JdbcUserRepositoryImpl();
		
		//part 3 
		service.setUserRepository(repository);
		
		System.out.println("The name is: " + service.findAll().get(0).getName());
		

	}

}
