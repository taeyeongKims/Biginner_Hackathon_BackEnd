package com.example.demo.controller;

import com.example.demo.domain.SdmVendor;
import com.example.demo.service.PlannerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
public class PlannerController {

    private final PlannerService plannerService;

    public PlannerController(PlannerService plannerService) {
        this.plannerService = plannerService;
    }

    @GetMapping("planners/sdmvendor")
    public ResponseEntity<List<SdmVendor>> getSdmVendor(@RequestParam String province,
                                                        @RequestParam String district,
                                                        @RequestParam int minPrice,
                                                        @RequestParam int maxPrice) {
        List<SdmVendor> SdmVendorList = plannerService.getSdmVendor(province, district, minPrice, maxPrice);

        return ResponseEntity.ok(SdmVendorList);
    }
}
