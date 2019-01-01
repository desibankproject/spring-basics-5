package com.spring.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.Product;
import com.spring.model.Bike;
import com.spring.service.IProductService;

public class FindAllProductsMain {
	public static void main(String[] args) {
		//Creating spring container and reading books.xml to creates beans
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("service-dao.xml");
		IProductService productService=(IProductService)applicationContext.getBean("pservice");
		List<Product> products=productService.findAll();
		products.stream().forEach(item->{
			System.out.println(item);
		});
	}
}
