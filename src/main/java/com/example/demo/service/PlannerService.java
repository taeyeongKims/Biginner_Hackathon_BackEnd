package com.example.demo.service;

import com.example.demo.Repository.PlannerRepository;
import com.example.demo.domain.SdmVendor;
import com.example.demo.domain.Studio;
import com.example.demo.domain.WeddingVenue;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class PlannerService {

    private final PlannerRepository plannerRepository;

    public PlannerService(PlannerRepository plannerRepository) {
        this.plannerRepository = plannerRepository;
    }

    public List<WeddingVenue> getWeddingVenue(String city, String district, int min, int max) {
        return plannerRepository.findWeddingVenue(city, district, min, max);
    }

    public List<Studio> getStudio(String city, String district, int min, int max) {
        return plannerRepository.findStudio(city, district, min, max);
    }

    public List<SdmVendor> getSdmVendor(String city, String district, int min, int max) {
        return plannerRepository.findSdmVendor(city, district, min, max);
    }
}
