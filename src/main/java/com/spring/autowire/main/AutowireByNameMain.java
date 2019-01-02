package com.spring.autowire.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Book;
import com.spring.model.Person;

public class AutowireByNameMain {
	public static void main(String[] args) {
		//Creating spring container and reading books.xml to creates beans
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("by-name-person-db.xml");
		Person person=(Person)applicationContext.getBean("person");
		System.out.println(person);
	}
}
