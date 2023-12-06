package com.vaii.semestralka;

import com.vaii.semestralka.entity.User;
import com.vaii.semestralka.reposiroty.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SemestralkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SemestralkaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserRepository ure) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}

//			User admin = new User("Admin","Admin",99,"admin","password","admin@admin.com");
//			ure.save(admin);
		};
	}

}
