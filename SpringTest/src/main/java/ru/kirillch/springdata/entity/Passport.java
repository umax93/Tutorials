package ru.kirillch.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passport {
@Id
@GeneratedValue
	private int id;
	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

	private String number;
	public Passport() {
		
	}
	
	public Passport(String number) {
		
		this.number = number;
	}
	
	
	
	
}
