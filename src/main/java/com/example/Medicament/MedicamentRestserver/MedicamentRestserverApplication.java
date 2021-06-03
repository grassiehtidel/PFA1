package com.example.Medicament.MedicamentRestserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@RestController
@EntityScan

public class MedicamentRestserverApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(MedicamentRestserverApplication.class, args);
    }

}
