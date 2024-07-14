package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SdmVendorDto {
    private String province;
    private String district;
    private int minPrice;
    private int maxPrice;
}
