package com.simplilearn.SpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.simplilearn.repositories.UserRepository;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityApplication {
public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

}
