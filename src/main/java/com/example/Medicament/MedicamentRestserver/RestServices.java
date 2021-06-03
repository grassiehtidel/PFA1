package com.example.Medicament.MedicamentRestserver;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



public class RestServices {
	 private static final Logger logger =  LoggerFactory.logger(RestServices.class);
	    
	    @GetMapping(value = "/")
	    public ResponseEntity<String> pong() 
	    {
	        logger.info("Démarrage des services OK .....");
	        return new ResponseEntity<String>("Réponse du serveur: "+HttpStatus.OK.name(), HttpStatus.OK);
	    }

}
