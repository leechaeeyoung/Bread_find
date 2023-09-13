package com.example.Bread_find;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.Bread_find.repository")
public class BreadFindApplication {

	public static void main(String[] args) {
		SpringApplication.run(BreadFindApplication.class, args);
	}

}
