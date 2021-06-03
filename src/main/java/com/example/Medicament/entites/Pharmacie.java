package com.example.Medicament.entites;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;




public class Pharmacie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idph;
	private String adresseph;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="idph",referencedColumnName="idph")
	private Pharmacien pharmacien;
	
	
	
	public Pharmacie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pharmacie(int idph, String adresseph) {
		super();
		this.idph = idph;
		this.adresseph = adresseph;
	}
	public int getIdph() {
		return idph;
	}
	public void setIdph(int idph) {
		this.idph = idph;
	}
	public String getAdresseph() {
		return adresseph;
	}
	public void setAdresseph(String adresseph) {
		this.adresseph = adresseph;
	}
	@Override
	public String toString() {
		return "Pharmacie [idph=" + idph + ", adresseph=" + adresseph + "]";
	}
	
	

}
