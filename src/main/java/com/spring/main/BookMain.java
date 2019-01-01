package com.spring.main;

import com.spring.model.Book;

public class BookMain {
	
	public static void main(String[] args) {
		//Who is creating an object here ? programmer
		Book b1=new Book();
		//Who is setting all these values?programmer
		b1.setAuther("Robert");
		b1.setBookid(123);
		b1.setPrice(9202);
		b1.setPublication("TMH");
		//who is managing the life cycle of the book object which b1?programming
		//who is managing the dependency of book ? programmer
		
		String result=b1.print();
		System.out.println(result);
	}

}
