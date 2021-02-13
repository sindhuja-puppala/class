package com.h2.pack.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.h2.pack.com.controller")
@ComponentScan("com.h2.pack.com.service")
public class StudentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(StudentApplication.class, args);
		System.out.println("contains resbean"+context.containsBeanDefinition("resBean"));
	}

}
