package com.example.demo.controller;

import com.example.demo.domain.Planner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.domain.SdmVendor;
import com.example.demo.service.PlannerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;


import java.util.List;
@Slf4j
@RequestMapping("/planners")
public class PlannerController {

    private final PlannerService plannerService;

    public PlannerController(PlannerService plannerService) {
        this.plannerService = plannerService;
    }

    @GetMapping("/sdmvendor")
    public ResponseEntity<List<SdmVendor>> getSdmVendor(@RequestParam String province,
                                                        @RequestParam String district,
                                                        @RequestParam int minPrice,
                                                        @RequestParam int maxPrice) {
        List<SdmVendor> SdmVendorList = plannerService.getSdmVendor(province, district, minPrice, maxPrice);

        return ResponseEntity.ok(SdmVendorList);

    }

    @PostMapping
    public ResponseEntity<Planner> createPlanner(@RequestBody Planner planner) {
        Planner savedPlanner = plannerService.savePlanner(planner);
        return ResponseEntity.ok(savedPlanner);
    }

    @GetMapping
    public ResponseEntity<List<Planner>> getAllPlanners() {
        List<Planner> planners = plannerService.findAllPlanners();
        return ResponseEntity.ok(planners);
}
}

 