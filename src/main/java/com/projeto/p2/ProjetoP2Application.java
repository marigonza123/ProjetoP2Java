package com.projeto.p2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ProjetoP2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoP2Application.class, args);
		System.out.print(new BCryptPasswordEncoder().encode("123"));
	}
	

}

