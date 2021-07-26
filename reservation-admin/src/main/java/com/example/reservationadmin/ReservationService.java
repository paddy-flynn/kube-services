package com.example.reservationadmin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("RESERVATION-SERVICE")
public interface ReservationService {

    @GetMapping( "/")
    List<Reservation> getReservations();

    @PostMapping( "/")
    Reservation makeReservation(Reservation r);
}
