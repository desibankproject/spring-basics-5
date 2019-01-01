package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Bike;

public class SpringBikeMain {
	public static void main(String[] args) {
		//Creating spring container and reading books.xml to creates beans
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bikes.xml");
		Bike b1=(Bike)applicationContext.getBean("bike");
		System.out.println(b1);
	}
}
