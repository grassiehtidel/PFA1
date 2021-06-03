package com.example.Medicament.MedicamentRestserver;

import org.springframework.boot.builder.SpringApplicationBuilder;

import com.example.Medicament.entites.Medicament;



public class ServletInitializer extends Medicament {
	
	

	  @Override
	
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(MedicamentRestserverApplication.class);
	    }
}
