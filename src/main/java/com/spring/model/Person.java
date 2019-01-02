package com.spring.model;

public class Person {
	private String name;
	private String email;
	private Database database;
	
	
	public Person(){
		System.out.println(")@#)#)#)#)#DC is called");
	}
	
	/*public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}*/

	public Person(Database database) {
		System.out.println(")@#)#)#)#)#PC is called");
		this.database = database;
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

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", database=" + database + "]";
	}

}
