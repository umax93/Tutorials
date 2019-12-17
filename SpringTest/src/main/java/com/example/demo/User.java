package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class User {
	
private String name="bob";
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
private String surname="vov";
public void show() {
	System.out.println("Show"+this.name+this.surname);
}
	
	
	
}
