package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.simplilearn.entity.Login;
import com.simplilearn.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService ls;

	@GetMapping("/")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("user", new Login());
		return mav;
	}

	@PostMapping("/adminlogin")
	public String signUp(@ModelAttribute("user") Login user) {
		Login User = null;
		System.out.println("from login" + user);
		if (user.getPassword() != "") 
		{
			System.out.println("logging in");
			User = ls.signgin(user.getUsername(), user.getPassword());
			return "menu";
		} 
		else {
			if (user.getNewPassword() != "") {
				System.out.println("Changing new password");
				User = ls.changePassword(user.getUsername(), user.getNewPassword());
				if (User == null) 
				{
					return "invalid_credentials";
				}
				return "menu";
			}
			return "invalid_credentials";
		}
	}

	@RequestMapping("/logout")
	public String logout() {
		return "conform_logout";
	}

}
