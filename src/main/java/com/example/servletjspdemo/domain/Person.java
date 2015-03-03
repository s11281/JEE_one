package com.example.servletjspdemo.domain;

public class Person {
	
	private Boolean test=false;
	private String firstName = "";
	private String name = "";
	private String email = "";
	private String email_pow="";
	private String pracodawca="";
	private String info="";
	private String info_box="";
	private String info2="";
	
	
	public Person() {
		super();
	}
	
	public Person(String firstName, String name, String email, String email_pow, String pracodawca,
			String info,String info_box, String info2) {
		super();
		this.firstName = firstName;
		this.name = name;
		this.email = email;
		this.email_pow = email_pow;
		this.pracodawca = pracodawca;
		this.info = info;
		this.info_box = info_box;
		this.info2 = info2;
		
	}
	
	public Boolean getTest() {
		return test;
	}
	public void setTest(Boolean test) {
		this.test = test;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
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
	
	public String getEmail_pow() {
		return email_pow;
	}

	public void setEmail_pow(String email_pow) {
		this.email_pow = email_pow;
	}

	public String getPracodawca() {
		return pracodawca;
	}

	public void setPracodawca(String pracodawca) {
		this.pracodawca = pracodawca;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getInfo_box() {
		return info_box;
	}

	public void setInfo_box(String info_box) {
		this.info_box = info_box;
	}

	public String getInfo2() {
		return info2;
	}

	public void setInfo2(String info2) {
		this.info2 = info2;
	}

	
	}

