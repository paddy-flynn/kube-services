package com.example.reservationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReservationServiceApplication implements CommandLineRunner {

	@Autowired
	ReservationRepository reservationRepository;

	public static void main(String[] args) {
		SpringApplication.run(ReservationServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.reservationRepository.deleteAll();

		this.reservationRepository.save(new Reservation("Paddy"));
		this.reservationRepository.save(new Reservation("Tom"));
		this.reservationRepository.save(new Reservation("Katie"));
		this.reservationRepository.save(new Reservation("Harry"));
	}
}

