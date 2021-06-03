/*package com.example.Medicament.controller;

import java.awt.PageAttributes.MediaType;
import java.util.Optional;
import java.util.logging.Logger;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Medicament.entites.User;

import Controleur.PostMapping;
import Controleur.RequestBody;


public class DefaultController {
    
    private static final Logger logger = LoggerFactory.getLogger(DefaultController.class);    
    @GetMapping(value = "/")
    public ResponseEntity<String> pong() {
        logger.info("Démarrage des services OK .....");
        return new ResponseEntity<String>("Réponse du serveur: "+HttpStatus.OK.name(), HttpStatus.OK);
    }

  
    @RequestMapping(method=RequestMethod.GET, value = "/user/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User findUserById(@PathVariable Long userId){
      DefaultController userService;
	return userService.findUserById(userId);
    }
  
  

}*/
