package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

	public static void main(String[] args) {
		System.out.println("Hello Spring jar is running");
		SpringApplication.run(JenkinsApplication.class, args);

	}

}
