package com.example.Medicament.service;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.Medicament.entites.Compte;
import com.example.Medicament.entites.User;
import com.example.Medicament.repos.CompteRepository;
import com.example.Medicament.repos.RoleRepository;



public class CompteServiceImpl implements CompteService  {
	
	private static final Logger logger = LoggerFactory.getLogger(CompteServiceImpl.class);
	private CompteRepository userRepository;
	private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
    
    
	private CompteRepository cr;
    
    public CompteServiceImpl() {
    	
		super();
	}
    
    
	
    
    @Override
	public Optional<Compte> findByLogin(String login) throws BusinessResourceException {
		
		Optional<User> userFound = Optional.empty();
        if (Boolean.FALSE.equals(userFound.isPresent())) {
            throw new BusinessResourceException("User Not Found", "L'utilisateur avec ce login n'existe pas :" + login);
        }
		return Optional.empty();
	}

	
	@Override
	public List<Compte> getAll() {
		return  cr.findAll();
	}

	@Override
	
	public Optional<Compte> getUserById(Integer id) throws BusinessResourceException {
		
		return cr.findById(id);
	}

	@Override
	public Optional<Compte> findByLogin1(String login) throws BusinessResourceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte saveOrUpdateUser(Compte compte) throws BusinessResourceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) throws BusinessResourceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Compte> findByLoginAndPassword(String login, String password) throws BusinessResourceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean existsByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCompte(Compte c) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public Optional<Compte> getUserById(Long id) throws BusinessResourceException {
		// TODO Auto-generated method stub
		return null;
	}


}
