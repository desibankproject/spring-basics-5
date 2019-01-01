package com.spring.service;

import java.util.List;

import com.spring.dao.Product;

public interface IProductService {

	public void save(Product product);

	public List<Product> findAll();

	public int deleteProductByPid(String pid);

}
