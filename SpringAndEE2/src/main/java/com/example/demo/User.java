package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="testtable")
public class User {
	public User() {
		
	}
	
	@Id
	@GeneratedValue
	private long id;
	//private boolean old;
	@Column
	private String name;
	@Column
	private String surname;

	//public boolean isOld() {
	//	return old;
	//}

	//public void setOld(boolean old) {
	//	this.old = old;
	//}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//
//	public User(String name, String surname ) {
//		this.name=name; this.surname=surname;
//		
//	}

}
