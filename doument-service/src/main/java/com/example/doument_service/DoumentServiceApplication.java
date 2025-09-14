package com.example.doument_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DoumentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoumentServiceApplication.class, args);
	}

}
