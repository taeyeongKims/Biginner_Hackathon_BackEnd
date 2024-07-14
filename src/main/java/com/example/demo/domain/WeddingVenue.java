package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Embeddable
public class WeddingVenue {

    @Id @GeneratedValue
    @Column(name="venue_id")
    private int id;

    @Column(name = "venue_name", length = 100)
    private String venueName;

    @Column(length = 255)
    private String address;

    private int price;
    private double rate;
}
