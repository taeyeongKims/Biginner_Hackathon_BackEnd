package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Embeddable
public class Studio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="studio_id")
    private int id;

    @Column(name="studio_name", length = 100)
    private String studioName;

    @Column(length = 255)
    private String address;

    private int price;
    private double rate;
}
