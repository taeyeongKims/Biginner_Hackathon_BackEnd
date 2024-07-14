package com.example.demo.controller;

import com.example.demo.domain.Planner;
import com.example.demo.service.PlannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planners")
public class PlannerController {

    @Autowired
    private PlannerService plannerService;

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
