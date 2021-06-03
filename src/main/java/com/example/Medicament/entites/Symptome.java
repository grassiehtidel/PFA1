package com.example.Medicament.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Symptome {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	private String nomsym;
	
	


	public Symptome() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomsym() {
		return nomsym;
	}

	public void setNomsym(String nomsym) {
		this.nomsym = nomsym;
	}

	@Override
	public String toString() {
		return "Symptome [id=" + id + ", nomsym=" + nomsym + "]";
	}


	

}
