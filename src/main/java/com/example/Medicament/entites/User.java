package com.example.Medicament.entites;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User extends Visiteur {

	private String nom;
	private String prenom;
	private String email;

	public User() {
		super();

	}

	public User(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [nom=" + nom + ", prenom=" + prenom + ", email=" + email + "]";
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getLogin() {
		// TODO Auto-generated method stub
		return null;
	}

}
