package com.example.gestion.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestion.models.Employe;
import com.example.gestion.repositories.EmployeRepository;

@RestController
public class EmployeController {

	@Autowired
	private EmployeRepository empR;
	
	@PostMapping("employe/ajouter")
	public void ajouterEmploye(@RequestBody Employe emp) {
		empR.save(emp);
		
	}
	@GetMapping("employe")
	public List<Employe> retournerEmployes(){
		
		return empR.findAll();
	}
	@GetMapping("employe/{id}")
	public Optional<Employe>rechercherEmployeParId(@PathVariable String id){
		
		return empR.findById(id);
	}
	@GetMapping("employe/rechercherParNom/{nom}")
	public Optional<Employe> rechercherEmployeParNom(@PathVariable String nom){
			
		return empR.findByNom(nom);
		
			
			
			
		}
	@GetMapping("employe/rechercherParEmail/{email}")
	public Optional<Employe> rechercherEmployePaEmail(@PathVariable String email){
			
		return empR.findByEmail(email);
		
			
			
			
		}
		
	@DeleteMapping("employe/supprimer/{id}")
	public void supprimerEmploye(@PathVariable String id) {
		empR.deleteById(id);
		
	}
	@PutMapping("employe/modifier/{id}")
	public void modifierEmploye(@PathVariable String id,@RequestBody Employe nouveauEmploye)
	{
		Optional<Employe> employe=empR.findById(id);
		if(employe.isPresent()) {
			Employe ancienEmploye=employe.get();
			ancienEmploye.setDateEmbauche(nouveauEmploye.getDateEmbauche());
			ancienEmploye.setEmail(nouveauEmploye.getEmail());
			ancienEmploye.setPoste(nouveauEmploye.getPoste());
			ancienEmploye.setNom(nouveauEmploye.getNom());
			empR.save(ancienEmploye);
			
			
			
		}
	
		
		
	}
	
	
	
	
}
