package com.spring.model;

public class Database {
	private String vendor;
	private String username;

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Database [vendor=" + vendor + ", username=" + username + "]";
	}

}
