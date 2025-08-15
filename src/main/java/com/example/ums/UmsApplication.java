package com.example.ums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class UmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmsApplication.class, args);
        System.out.println("UmsApplication has started successfully.");
	}

}
