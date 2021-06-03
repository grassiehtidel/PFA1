package com.example.Medicament;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.entites","com.example.repo","com.example.controller","com.example.service","com.example.config","com.example.MedicamentRestserver"})
public class MedicamentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicamentApplication.class, args);
	}
}
