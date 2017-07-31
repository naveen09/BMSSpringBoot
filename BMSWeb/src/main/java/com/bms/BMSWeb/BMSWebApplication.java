package com.bms.BMSWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.bms.*")
@SpringBootApplication
public class BMSWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BMSWebApplication.class, args);
	}
}
