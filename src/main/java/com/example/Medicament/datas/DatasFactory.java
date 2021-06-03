package com.example.Medicament.datas;

import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@Component
	@Configuration
	@EnableJpaRepositories
	public class DatasFactory {

	    private DataSource dataSource;

	    public DatasFactory() {
	        super();
	    }

}
