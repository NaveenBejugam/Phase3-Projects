package com.simplilearn.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.simplilearn.entities.MyUserDetails;
import com.simplilearn.entities.User;
import com.simplilearn.repositories.UserRepository;


public class Service implements UserDetailsService {
	@Autowired
	UserRepository userRepo;

	public User GetUserByName(String name) {
		Optional<User> user = userRepo.findUserByName(name);
		if (!user.isPresent())
			throw new RuntimeException();
		return user.get();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return new MyUserDetails(GetUserByName(username));
	}

	
}
