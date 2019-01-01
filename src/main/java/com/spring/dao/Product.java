package com.spring.dao;
/**
 * 
 * @author Nagendra
 * 
 * Spring will not manage pojo  as bean
 * means spring will not create an object of pojo class
 * since pojo does not contain the business logic
 * 
 * What is POJO - Plain Old java Object
 * 1. its all the attributes should be private
 * 2. it must contain setters and getters for all it;s private attributes
 * 3. it must have public and default constructor
 * 4. it does not extends any special class 
 */
public class Product {
	private String pid;
	private String name;
	private String category;
	private float price;
	
	public Product(){
		
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}

}
