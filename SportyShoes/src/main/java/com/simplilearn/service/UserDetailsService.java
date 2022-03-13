package com.simplilearn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simplilearn.entity.UserDetails;
import com.simplilearn.repository.UserDetailsRepository;


@Service
public class UserDetailsService {
	
	UserDetailsRepository userRepo;
	
	public List<UserDetails>listAll()
	{
	return userRepo.findAll();
	}
	public List<UserDetails>get(String username) {
		return userRepo.findByusername(username);
	}

}

