package com.example.textsearchapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TextsearchApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TextsearchApiApplication.class, args);
	}

}
