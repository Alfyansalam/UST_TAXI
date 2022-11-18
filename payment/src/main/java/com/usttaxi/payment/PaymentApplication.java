package com.usttaxi.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//Using generated security password: 8553cd2a-e6b1-4265-8be3-b2b3a1d042ae

@EnableAutoConfiguration
@SpringBootApplication
public class PaymentApplication {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
	}

}
