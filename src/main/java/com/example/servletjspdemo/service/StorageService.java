package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletjspdemo.domain.Person;

public class StorageService {
	private String status;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private List<Person> db = new ArrayList<Person>();
	
	public void add(Person person,Boolean test){
		if(db.size()<=5 && !test){
		Person newPerson = new Person(person.getFirstName(), person.getName() ,person.getEmail());
		db.add(newPerson);
		status="zapisano";}
		else
		{status="nie zapisano";}
	}
	
	public List<Person> getAllPersons(){
		return db;
		
	}

}
