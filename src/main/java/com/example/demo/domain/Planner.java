package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Planner {
    @Id @GeneratedValue
    @Column(name = "planner_id")
    private int id;

    @OneToOne
    @JoinColumn(name = "sdm_vendor_id")
    private SdmVendor sdmVendor;

    @OneToOne
    @JoinColumn(name = "wedding_venue_id")
    private WeddingVenue weddingVenue;

    @OneToOne
    @JoinColumn(name = "studio_id")
    private Studio studio;


}