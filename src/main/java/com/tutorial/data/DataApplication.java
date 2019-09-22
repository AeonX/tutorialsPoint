package com.tutorial.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DataApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DataApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DataApplication.class, args);
	}
	
	@RequestMapping(value="/")
	public String hello() {
		return "Hello World from Tomcat";
	}

}
