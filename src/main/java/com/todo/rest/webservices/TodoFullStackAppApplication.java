package com.todo.rest.webservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.todo.rest.webservices.helloworld","com.todo.rest.webservices.todo","com.todo.rest.webservices.basic.auth"})
public class TodoFullStackAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoFullStackAppApplication.class, args);
	}

}
