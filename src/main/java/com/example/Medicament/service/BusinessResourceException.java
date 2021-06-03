package com.example.Medicament.service;

import org.springframework.http.HttpStatus;

public class BusinessResourceException extends Exception {

	public BusinessResourceException(String string, String string2) {
		// TODO Auto-generated constructor stub
		super(string+" "+string2);
	}

	public BusinessResourceException(String string, String string2, HttpStatus notFound) {
		// TODO Auto-generated constructor stub
	}

}
