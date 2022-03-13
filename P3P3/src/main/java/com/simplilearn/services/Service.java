package com.simplilearn.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import com.simplilearn.entities.User;
import com.simplilearn.exceptions.UserNotFound;
import com.simplilearn.repositories.Authentication;

public class Service {
	@Autowired
	Authentication authRepo;

	public User GetUserByName(String name) {
		Optional<User> found = authRepo.findUserByName(name);
		if (found.isPresent())
			return found.get();
		else
			throw new UserNotFound();
	}

	public Boolean isValidPassword(String cmp, String actual) {
		return ((cmp.equals(actual)) ? true : false);
	}
}
