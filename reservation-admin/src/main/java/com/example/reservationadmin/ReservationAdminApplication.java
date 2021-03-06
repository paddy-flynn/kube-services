package com.example.reservationadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@Configuration
public class ReservationAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationAdminApplication.class, args);
	}

}
