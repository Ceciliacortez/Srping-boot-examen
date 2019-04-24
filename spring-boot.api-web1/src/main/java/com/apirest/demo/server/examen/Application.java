package com.apirest.demo.server.examen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.apirest.demo.examen")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
