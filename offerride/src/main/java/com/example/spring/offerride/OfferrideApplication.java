package com.example.spring.offerride;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OfferrideApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfferrideApplication.class, args);
	}


}
