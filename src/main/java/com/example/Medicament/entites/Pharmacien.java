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


@Entity
public class Pharmacien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idP;
	private String nomp;
	


	public Pharmacien() {
		super();
	
	}
	
	

	public Pharmacien(int idP, String nomp) {
		super();
		this.idP = idP;
		this.nomp = nomp;
	}



	public int getIdP() {
		return idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}

	public String getNomp() {
		return nomp;
	}

	public void setNomp(String nomp) {
		this.nomp = nomp;
	}

	@Override
	public String toString() {
		return "Pharmacien [idP=" + idP + ", nomp=" + nomp + "]";
	}

	

}
