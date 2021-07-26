package com.example.reservationadmin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    Long id;
    String name;

    public Reservation(String name) {
        this.name = name;
    }
}
