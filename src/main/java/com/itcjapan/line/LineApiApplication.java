package com.itcjapan.line;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class LineApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LineApiApplication.class, args);
	}

	@RequestMapping(value="/")
	String hello() {
		return "hello";

	}
}
