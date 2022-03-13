package com.simplilearn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simplilearn.entity.Product;
import com.simplilearn.repository.ProductRepository;

@Service
public class ProductService {
	
	public ProductRepository prorepo;
	
	public List<Product>listAll()
	{
		return prorepo.findAll();
	}
	
	public void save(Product product)
	{
		prorepo.save(product);
	}

}
