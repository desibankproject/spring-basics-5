package com.spring.model;

//POJO - Plain Old Java Object
//1. all the attribute should be private
//2. It should have getter and setter
//3. it must have public default constructor
//4. It should extends any special class
//
public class Book {
	private String auther;
	private int price;
	private String publication;
	private int bookid;

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	
	public String print(){
		return "Book [auther=" + auther + ", price=" + price + ", publication=" + publication + ", bookid=" + bookid
				+ "]";
	}

	@Override
	public String toString() {
		return "Book [auther=" + auther + ", price=" + price + ", publication=" + publication + ", bookid=" + bookid
				+ "]";
	}

}
