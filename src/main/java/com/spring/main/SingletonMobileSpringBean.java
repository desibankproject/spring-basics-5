package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Book;
import com.spring.model.Mobile;

public class SingletonMobileSpringBean {
	public static void main(String[] args) {
		//Creating spring container and reading books.xml to creates beans
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("singleton-mobiles.xml");
		Mobile b1=(Mobile)applicationContext.getBean("b1");
		System.out.println(b1);
		System.out.println("b1.hashCode = "+b1.hashCode());
		
		Mobile b2=(Mobile)applicationContext.getBean("b1");
		System.out.println(b2);
		System.out.println("b2.hashCode = "+b2.hashCode());
		
		
		Mobile b3=(Mobile)applicationContext.getBean("b1");
		System.out.println(b3);
		System.out.println("b3.hashCode = "+b3.hashCode());

		Mobile b4=(Mobile)applicationContext.getBean("b1");
		System.out.println(b4);
		System.out.println("b4.hashCode = "+b4.hashCode());
		
		Mobile b5=(Mobile)applicationContext.getBean("b1");
		System.out.println(b5);
		System.out.println("b5.hashCode = "+b5.hashCode());
		
		
	}
}
