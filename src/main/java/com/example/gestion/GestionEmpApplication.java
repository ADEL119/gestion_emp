package com.example.gestion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.example.gestion.repositories") 
public class GestionEmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionEmpApplication.class, args);
	}

}
