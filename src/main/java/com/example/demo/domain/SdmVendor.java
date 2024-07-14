package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Embeddable
public class SdmVendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sdm_vendor_id")
    private int id;

    @Column(name="sdm_vendor_name", length = 100)
    private String sdmVendorName;

    @Column(length = 255)
    private String address;

    private int price;
    private double rate;
}
