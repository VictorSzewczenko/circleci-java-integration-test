package com.victorszewczenko.circleciintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CircleciIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircleciIntegrationApplication.class, args);

		System.out.println("Hello There!");
	}

}
