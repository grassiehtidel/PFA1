package com.example.Medicament.entites;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Admin extends User {
	private String noma;
	
	
	public Admin() {
		super();

	}

	public Admin(String noma) {
		super();
		this.noma = noma;
	}



	public String getNoma() {
		return noma;
	}

	public void setNoma(String noma) {
		this.noma = noma;
	}

	@Override
	public String toString() {
		return "Admin [noma=" + noma + "]";
	}

}
