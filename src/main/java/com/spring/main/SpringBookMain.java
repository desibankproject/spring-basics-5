package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Book;

public class SpringBookMain {
	public static void main(String[] args) {
		//Creating spring container and reading books.xml to creates beans
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("books.xml");
		Book b1=(Book)applicationContext.getBean("b1");
		String result=b1.print();
		System.out.println(result);
	}
}
