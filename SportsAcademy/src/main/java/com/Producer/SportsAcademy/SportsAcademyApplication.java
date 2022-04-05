package com.Producer.SportsAcademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SportsAcademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportsAcademyApplication.class, args);
	}

}
