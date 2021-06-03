package com.example.Medicament.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Medicament.entites.Medicament;

public interface MedicamentRepository extends JpaRepository < Medicament, Long> {
	Medicament findByNom(String nom);
	
	
}
