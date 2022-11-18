package com.usttaxi.passenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class PassengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerApplication.class, args);
	}
	
  //  @LoadBalanced
	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
}
}