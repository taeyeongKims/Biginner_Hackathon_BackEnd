package com.example.demo.repository;

import com.example.demo.domain.Planner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlannerRepository extends JpaRepository<Planner, Integer> {
}