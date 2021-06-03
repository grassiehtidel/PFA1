package com.example.Medicament.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import com.example.Medicament.entites.Compte;


public interface CompteRepository extends JpaRepository <Compte, Integer>{
	
	Optional<Compte> findByLogin(String login);
	Boolean existsByLogin(String login);

}
