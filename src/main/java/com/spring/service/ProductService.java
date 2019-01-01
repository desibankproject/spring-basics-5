package com.spring.service;

import java.util.List;

import com.spring.dao.IBizDao;
import com.spring.dao.Product;

public class ProductService implements IProductService {
	//IBizDao eee=new BizDao();
	private IBizDao bizDao;

	public IBizDao getBizDao() {
		return bizDao;
	}

	public void setBizDao(IBizDao bizDao) {
		this.bizDao = bizDao;
	}
	
	@Override
	public void save(Product  product){
		bizDao.addProduct(product);
	}
	
	@Override
	public List<Product> findAll(){
		return bizDao.findProducts();
	}
	@Override
	public int deleteProductByPid(String pid){
		return bizDao.deleteProductByPid(pid);
	}
	
}
