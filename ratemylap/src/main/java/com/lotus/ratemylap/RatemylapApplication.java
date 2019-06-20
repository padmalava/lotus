package com.lotus.ratemylap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(value = "com.lotus.ratemylap.dto")
@EnableJpaRepositories("com.lotus.ratemylap.repository")
@ComponentScan({"com.lotus.ratemylap.controller","com.lotus.ratemylap.service","com.lotus.ratemylap.serviceImpl","com.lotus.ratemylap.request","com.lotus.ratemylap.response"})
public class RatemylapApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatemylapApplication.class, args);
	}

}
