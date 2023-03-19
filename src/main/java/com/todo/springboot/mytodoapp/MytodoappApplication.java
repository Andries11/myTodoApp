package com.todo.springboot.mytodoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class MytodoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MytodoappApplication.class, args);
	}


}
