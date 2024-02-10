package com.elite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ExerciceManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciceManyApplication.class, args);
	}

}
