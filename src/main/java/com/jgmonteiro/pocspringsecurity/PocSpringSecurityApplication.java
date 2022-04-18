package com.jgmonteiro.pocspringsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class PocSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocSpringSecurityApplication.class, args);
	}

}
