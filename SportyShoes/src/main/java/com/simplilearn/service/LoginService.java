package com.simplilearn.service;



import org.springframework.stereotype.Service;

import com.simplilearn.entity.Login;
import com.simplilearn.repository.LoginRepository;


@Service
public class LoginService{
	
	private LoginRepository log;
	 public Login signgin(String username, String password) {
		 
		  Login user = log.findByUsernameAndPassword(username, password);
		System.out.println("from service" + user);
		
		return user;
	  }
	
	public Login changePassword(String username, String newpassword) {
		// TODO Auto-generated method stub
		Login uplogin = null;
		Login user = log.findByUsername(username);
		if(user !=null ) {
			System.out.println("user" + user);
			log.changePassword(newpassword, user.getId());
			uplogin = log.findByUsername(username);
			
			System.out.println("Password Changed");
			return uplogin;
		}
		return null;
	}
}
	
