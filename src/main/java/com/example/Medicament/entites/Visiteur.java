package com.example.Medicament.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)

public class Visiteur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String adressev;

	public Visiteur() {
		super();

	}

	public Visiteur(int idv, String nomv, String adressev) {
		super();
		this.id = idv;

		this.adressev = adressev;
	}

	public int getIdv() {
		return id;
	}

	public void setIdv(int idv) {
		this.id = idv;
	}

	public String getAdressev() {
		return adressev;
	}

	public void setAdressev(String adressev) {
		this.adressev = adressev;
	}

	@Override
	public String toString() {
		return "Visiteur [idv=" + id + ", adressev=" + adressev + "]";
	}

}
