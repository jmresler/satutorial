package org.jmresler.sakila;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jmresler.sakila.db.ActorRepository;
import org.jmresler.sakila.db.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactuiApplication {
	
	private static final Logger logger = LogManager.getLogger(ReactuiApplication.class);
	@Autowired protected ActorRepository actorRep;
	@Autowired protected UserRepository userRep;
	
	public static void main(String[] args) {
		SpringApplication.run(ReactuiApplication.class, args);
		
		logger.info("YEEHAW! Let's ride!");
	}

	@Bean
	protected CommandLineRunner runner() {
		return args -> {
		};
	}
}
