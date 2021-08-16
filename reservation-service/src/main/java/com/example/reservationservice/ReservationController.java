package com.example.reservationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController {

    @Autowired
    ReservationRepository reservationRepository;

    @Value("${temp.prop}")
    String tempProp;

    @GetMapping("/server")
    public String serverType() {
        return this.tempProp;
    }

    @GetMapping
    public List<Reservation> reservations() {
        return this.reservationRepository.findAll();
    }

    @PostMapping
    public Reservation saveReservation(@RequestBody Reservation r){
        Reservation saved = this.reservationRepository.save(r);
        return saved;
    }
}
