package com.kl.centre.exception.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.kl.centre")
public class SpringbootExceptionHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootExceptionHandlingApplication.class, args);
	}

}

