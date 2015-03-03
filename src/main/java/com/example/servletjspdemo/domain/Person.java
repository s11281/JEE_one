package com.example.servletjspdemo.domain;

public class Person {
	
	public Person(String firstName, String name, String email) {
		super();
		this.firstName = firstName;
		this.name = name;
		this.email = email;
	}
	
	private Boolean test=false;
	
	public Boolean getTest() {
		return test;
	}

	public void setTest(Boolean test) {
		this.test = test;
	}

	private String firstName = "unknown";
	private String name = "unknown";
	private String email = "unknown";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public Person() {
		super();
	}
	
	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	}

