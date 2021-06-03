package com.example.Medicament.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.apache.commons.collections4.IteratorUtils;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.Medicament.entites.Role;
import com.example.Medicament.entites.User;
import com.example.Medicament.repos.RoleRepository;
import com.example.Medicament.repos.UserRepository;
import com.sun.el.stream.Stream;

import ch.qos.logback.classic.Logger;

@Service
public class UserServiceImpl implements UserService {
@Autowired
UserRepository userRepository;
	public UserServiceImpl() {
		super();
	}
	@Override
	public List<User> findAll(){
		return userRepository.findAll();
	}

	@SuppressWarnings("unused")
	private Set<Role> extractRole_BeforeJava8(Set<Role> rolesSetFromUser, Collection<Role> rolesFromDB) {
		Set<Role> rolesToAdd = new HashSet<>();
		for (Role roleFromUser : rolesSetFromUser) {
			for (Role roleFromDB : rolesFromDB) {
				if (roleFromDB.compareTo(roleFromUser) == 0) {
					rolesToAdd.add(roleFromDB);
					break;
				}
			}
		}
		return rolesToAdd;
	}

	@Override
	public User saveOrUpdateUser(User user) throws BusinessResourceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User saveOrUpdateUser1(User user) throws BusinessResourceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) throws BusinessResourceException {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<User> findById(Long id) throws BusinessResourceException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<User> findByLoginAndPassword(Object login, String password) {
		// TODO Auto-generated method stub
		return null;
	}


}
