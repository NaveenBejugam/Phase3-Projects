package com.simplilearn.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.simplilearn.entity.Categories;
import com.simplilearn.service.CategoriesService;

@Controller
public class CategoriesController {
	@Autowired
	private CategoriesService catserv;
	@RequestMapping("/listcat")
	public String viewListPage(Model model)
	{
		List<Categories>listCategories= catserv.listAll();
		model.addAttribute("listCategories", listCategories);
		return "manage";
	}
	
	@PostMapping(value = "/save")
	public String saveCategory(@ModelAttribute("categories") Categories categories, Model m) 
	{   
		catserv.save(categories);
		List<Categories>listCategories= catserv.listAll();
		m.addAttribute("listCategories", listCategories);
	return "manage";
	}	
	@RequestMapping("/delete/{id}")
	public String deleteCategory(@PathVariable(name ="id") long id, Model m)
	{
		catserv.delete(id);
		List<Categories>listCategories= catserv.listAll();
		m.addAttribute("listCategories", listCategories);
		return "manage";
	}
	}
