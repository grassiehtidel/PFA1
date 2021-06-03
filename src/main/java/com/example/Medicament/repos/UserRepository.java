package com.example.Medicament.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Medicament.entites.User;

public interface UserRepository extends JpaRepository <User, Integer> {

	Optional<User> findById(int id);
	
	void deleteById(Long id);

}
