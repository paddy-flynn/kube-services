package com.example.reservationadmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationAdminController {

    @Autowired
    ReservationService reservationService;

    @GetMapping
    public List<Reservation> reservations() {
        return this.reservationService.getReservations();
    }

    @PostMapping
    public Reservation reservation(@RequestBody Reservation r) {
        return this.reservationService.makeReservation(r);
    }
}
