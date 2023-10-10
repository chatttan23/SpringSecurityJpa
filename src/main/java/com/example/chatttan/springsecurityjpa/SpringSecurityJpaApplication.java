package com.example.chatttan.springsecurityjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.chatttan.springsecurityjpa.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpaApplication.class, args);
	}

}
