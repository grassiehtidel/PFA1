package com.example.Medicament.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ROLE_ID", updatable = false, nullable = false)
	private int idr;
	@Column(name="ROLE_NAME", updatable = true, nullable = false)
	private String nomR;
	
	@Enumerated(EnumType.STRING)
	
	ERole erole;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(int idr, String nomR, ERole erole) {
		super();
		this.idr = idr;
		this.nomR = nomR;
		this.erole = erole;
	}

	public Role(String string) {
		// TODO Auto-generated constructor stub
	}

	public int getIdr() {
		return idr;
	}

	public void setIdr(int idr) {
		this.idr = idr;
	}

	public String getNomR() {
		return nomR;
	}

	public void setNomR(String nomR) {
		this.nomR = nomR;
	}

	public ERole getErole() {
		return erole;
	}

	public void setErole(ERole erole) {
		this.erole = erole;
	}

	@Override
	public String toString() {
		return "Role [idr=" + idr + ", nomR=" + nomR + ", erole=" + erole + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((erole == null) ? 0 : erole.hashCode());
		result = prime * result + idr;
		result = prime * result + ((nomR == null) ? 0 : nomR.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		if (erole != other.erole)
			return false;
		if (idr != other.idr)
			return false;
		if (nomR == null) {
			if (other.nomR != null)
				return false;
		} else if (!nomR.equals(other.nomR))
			return false;
		return true;
	}
	
	public int compareTo(Role role){
		return this.nomR.compareTo(role.getNomR());
		
	}
	

}
