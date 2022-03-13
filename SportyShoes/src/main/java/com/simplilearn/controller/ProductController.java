package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.simplilearn.entity.Product;
import com.simplilearn.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	public ProductService prodserv;
	
	@RequestMapping("/listprod")
	public String viewListProductPage(Model model)
	{
		List<Product>listProduct= prodserv.listAll();
		model.addAttribute("listProduct", listProduct);
		return"product_manage";
		
	}
	
	@RequestMapping("/newproduct")
	public String addNewProductPage(Model model)
	{
		Product product= new Product();
		model.addAttribute("product", product);
		
		return"new_product";
	}
	
	@PostMapping(value = "/saveproduct")
	public String saveCategory(@ModelAttribute("product") Product product, Model md) 
	{   
		
		prodserv.save(product);
		List<Product>listProduct= prodserv.listAll();
		md.addAttribute("listProduct", listProduct);
		
		return"product_manage";
	
	}
	

}