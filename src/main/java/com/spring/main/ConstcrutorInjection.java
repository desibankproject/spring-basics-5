package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Book;
import com.spring.model.Mobile;

public class ConstcrutorInjection {
	public static void main(String[] args) {
		//Creating spring container and reading books.xml to creates beans
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mobiles.xml");
		Mobile b1=(Mobile)applicationContext.getBean("b1");
		System.out.println(b1);
	}
}
