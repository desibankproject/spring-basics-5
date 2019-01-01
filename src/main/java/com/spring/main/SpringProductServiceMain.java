package com.spring.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.Product;
import com.spring.model.Bike;
import com.spring.service.IProductService;

public class SpringProductServiceMain {
	public static void main(String[] args) {
		//Creating spring container and reading books.xml to creates beans
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("service-dao.xml");
		IProductService productService=(IProductService)applicationContext.getBean("pservice");
		Product product=new Product(); //why spring container is not creating an instance of this product here Product
		//here 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter category!");
		String category=scanner.next();
		product.setCategory(category);
		System.out.println("Enter name!");
		String name=scanner.next();
		product.setName(name);
		System.out.println("Enter pid!");
		String pid=scanner.next();
		product.setPid(pid);
		System.out.println("Enter price!");
		float price=scanner.nextFloat();
		product.setPrice(price);
		productService.save(product);
		System.out.println(")@)@)@");
	}
}
