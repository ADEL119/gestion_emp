package com.example.gestion.models;


import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document (collection="employes")
public class Employe {
	
	@Id
	private String id;
	
	private String nom;
	
	private String poste;
	
	private String email;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd") //bch tkoun date yyyy-mm-dd
	private LocalDate dateEmbauche;
	
	
	public Employe() {
		
	}
	
	public Employe(String id, String nom, String poste, String email, LocalDate dateEmbauche) {
		
		this.id = id;
		this.nom = nom;
		this.poste = poste;
		this.email = email;
		this.dateEmbauche = dateEmbauche;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(LocalDate dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	
	
	
	

}
