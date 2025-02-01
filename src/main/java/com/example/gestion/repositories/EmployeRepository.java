package com.example.gestion.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.gestion.models.Employe;

public interface EmployeRepository extends MongoRepository<Employe,String>{
	
	Optional<Employe> findByNom(String nom);
	Optional<Employe> findByEmail(String email);

	
	
}
