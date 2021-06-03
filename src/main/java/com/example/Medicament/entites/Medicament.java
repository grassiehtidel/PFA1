package com.example.Medicament.entites;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.boot.builder.SpringApplicationBuilder;

@Entity
public class Medicament {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String nom;
	private String composant;
	
	@ManyToOne
	@JoinColumn(name="role_id",nullable=false)
	private Admin admin;

	
	@ManyToMany
	@JoinColumn(name="id")
	private Collection<Symptome> symptome;
	
	public Medicament() {
		super();
		
	}
	
	
	
	public Medicament(Long id, String nom, String composant) {
		super();
		this.id = id;
		this.nom = nom;
		this.composant = composant;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getComposant() {
		return composant;
	}



	public void setComposant(String composant) {
		this.composant = composant;
	}



	@Override
	public String toString() {
		return "Medicament [id=" + id + ", nom=" + nom + ", composant=" + composant + "]";
	}



	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		// TODO Auto-generated method stub
		return null;
	}



	


	
	

}
