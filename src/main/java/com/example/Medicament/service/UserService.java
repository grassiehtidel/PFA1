package com.example.Medicament.service;

import java.util.List;
import java.util.Optional;

import com.example.Medicament.entites.User;

public interface UserService {

	Optional<User> findById(Long id) throws BusinessResourceException;

	User saveOrUpdateUser(User user) throws BusinessResourceException;

	void deleteUser(Long id) throws BusinessResourceException;

	User saveOrUpdateUser1(User user) throws BusinessResourceException;
	
	List<User> findAll() throws BusinessResourceException;

	Optional<User> findByLoginAndPassword(Object login, String password);

}
