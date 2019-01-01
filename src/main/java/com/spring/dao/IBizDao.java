package com.spring.dao;

import java.util.List;

public interface IBizDao {

	public void addProduct(Product product);

	public List<Product> findProducts();

	public int deleteProductByPid(String pid);

}
