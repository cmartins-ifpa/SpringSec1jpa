package edu.ifpa.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;


@SpringBootApplication 
public class AppJpaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppJpaSpringApplication.class, args);
	}

}
