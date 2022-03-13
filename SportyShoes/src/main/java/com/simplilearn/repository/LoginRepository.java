package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
	Login findByUsernameAndPassword(String username, String password);
	Login findByUsername(String username);
	void changePassword(String newpassword, Long id);
	
	
}