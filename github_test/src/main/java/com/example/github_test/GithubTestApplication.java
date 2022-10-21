package com.example.github_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class GithubTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubTestApplication.class, args);
	}

}
