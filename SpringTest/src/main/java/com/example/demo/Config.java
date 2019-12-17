package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean("jjj")
public User user() {
		User user =new User();
		user.setName("Hyy");
		user.setSurname("hhhhh");
	return user;
}
	
}
