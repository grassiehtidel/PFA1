package com.example.Medicament.service;

import java.util.Collection;

import com.example.Medicament.entites.Role;
import com.sun.el.stream.Stream;

public interface RoleService {

	Role findByRoleName(String roleName);
	
	Collection<Role> getAll();

}
