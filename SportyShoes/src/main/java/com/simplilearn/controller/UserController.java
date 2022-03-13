package com.simplilearn.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.simplilearn.entity.UserDetails;
import com.simplilearn.service.UserDetailsService;

@Controller
public class UserController {
	@Autowired
	UserDetailsService userservice;
	
	@GetMapping("/index")
	public String User(Model model)
	{
		List<UserDetails>listUsers= userservice.listAll();
		System.out.println("listUsers" + listUsers);
		model.addAttribute("listUsers",listUsers);
		return "/index";
	}

	@GetMapping("/user/{username}")
	public String findUserName(@PathVariable(name="username")String username)
	{	
		
		ModelAndView mav = new ModelAndView("find");
		List<UserDetails>userdetails=userservice.get(username);
		mav.addObject("userdetails", userdetails);
		return "finduser";
	}
}
