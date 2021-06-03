package com.example.Medicament.repos;



import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Medicament.entites.Role;


public interface RoleRepository extends JpaRepository <Role, Integer> {
	
	Role findByNomR(String nomR);
   
//	Collection<Role> getAll();

}
