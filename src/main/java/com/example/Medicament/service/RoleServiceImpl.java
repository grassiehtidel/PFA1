package com.example.Medicament.service;

import java.util.Collection;
import java.util.stream.Collectors;

import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Medicament.entites.Role;
import com.example.Medicament.repos.RoleRepository;
import com.sun.el.stream.Stream;


@Service

public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	public RoleServiceImpl() {
		super();
	}
	

	@Override
	public Collection<Role> getAll() {
		return IteratorUtils.toList(roleRepository.findAll().iterator());
	}
	
	

	
	@Override
	public Role findByRoleName(String roleName) {
		return roleRepository.findByNomR(roleName);
	}

}
