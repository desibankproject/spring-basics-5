package com.spring.model;

public class Mobile {
	private String name;
	private String color;
	private int price;
	
	public Mobile(){
		
	}

	public Mobile(String name, String color, int price) {
		System.out.println("Hey! mobile is instantiated!!!!!!!!");
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", color=" + color + ", price=" + price + "]";
	}

}
