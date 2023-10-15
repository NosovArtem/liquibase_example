package com.nsv.soft.dev.lab.liquibase_example;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class LiquibaseExampleApplication {


	public static void main(String[] args) {
		SpringApplication.run(LiquibaseExampleApplication.class, args);
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Dotenv getDotenv(){
		return Dotenv.configure().load();
	}

}
