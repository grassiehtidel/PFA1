package com.example.Medicament.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
public class Client extends User {

	private String nomcl;



	public Client() {
		super();
		
	}



	public Client( String nomcl) {
		super();
		this.nomcl = nomcl;
	}





	public String getNomcl() {
		return nomcl;
	}



	public void setNomcl(String nomcl) {
		this.nomcl = nomcl;
	}



	@Override
	public String toString() {
		return "Client [nomcl=" + nomcl + "]";
	}

				
	
	
	
	
}

	