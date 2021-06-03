package com.example.Medicament.service;


import java.util.List;
import java.util.Optional;

import com.example.Medicament.entites.Compte;


public interface CompteService {
	
     List<Compte> getAll();
	
	Optional<Compte> getUserById(Long id) throws BusinessResourceException;
	
	Optional<Compte> findByLogin1(String login) throws BusinessResourceException;
	
	Compte saveOrUpdateUser(Compte compte) throws BusinessResourceException;
	
	void deleteUser(Long id) throws BusinessResourceException;

	Optional<Compte> findByLoginAndPassword(String login, String password) throws BusinessResourceException;


	
	
	Optional<Compte> findByLogin(String login) throws BusinessResourceException;
	Boolean existsByLogin(String login);
	
	public void addCompte(Compte c);

	Optional<Compte> getUserById(Integer id) throws BusinessResourceException;

	
	
	

}
