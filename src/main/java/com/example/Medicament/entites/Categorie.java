package com.example.Medicament.entites;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int idcat;
	private String nomc;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private Medicament medicament;

	public Categorie() {
		super();

	}

	public Categorie(int idcat, String nomc) {
		super();
		this.idcat = idcat;
		this.nomc = nomc;
	}

	public int getIdcat() {
		return idcat;
	}

	public void setIdcat(int idcat) {
		this.idcat = idcat;
	}

	public String getNomc() {
		return nomc;
	}

	public void setNomc(String nomc) {
		this.nomc = nomc;
	}

	@Override
	public String toString() {
		return "Categorie [idcat=" + idcat + ", nomc=" + nomc + "]";
	}

}
