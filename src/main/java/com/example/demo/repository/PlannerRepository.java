package com.example.demo.Repository;

import com.example.demo.domain.SdmVendor;
import com.example.demo.domain.Studio;
import com.example.demo.domain.WeddingVenue;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlannerRepository {
    @PersistenceContext
    private final EntityManager em;

    public PlannerRepository(EntityManager em) {
        this.em = em;
    }

    public List<WeddingVenue> findWeddingVenue(String city, String district, int min, int max){
        String jpql = "select wv from WeddingVenue wv where wv.address LIKE :city AND wv.address LIKE :district AND wv.price BETWEEN :min AND :max";
        TypedQuery<WeddingVenue> query = em.createQuery(jpql, WeddingVenue.class);
        query.setParameter("city", "%" + city + "%");
        query.setParameter("min", min);
        query.setParameter("max", max);
        return query.getResultList();
    }

    public List<Studio> findStudio(String city, String district, int min, int max) {
        String jpql = "SELECT s FROM Studio s WHERE s.address LIKE :city AND s.address LIKE :district AND s.price BETWEEN :min AND :max";
        TypedQuery<Studio> query = em.createQuery(jpql, Studio.class);
        query.setParameter("city", "%" + city + "%");
        query.setParameter("district", "%" + district + "%");
        query.setParameter("min", min);
        query.setParameter("max", max);
        return query.getResultList();
    }


    public List<SdmVendor> findSdmVendor(String city,  String district, int min, int max){
        String jpql = "SELECT sdm FROM SdmVendor sdm WHERE sdm.address LIKE :city AND sdm.address LIKE :district AND sdm.price BETWEEN :min AND :max";
        TypedQuery<SdmVendor> query = em.createQuery(jpql, SdmVendor.class);
        query.setParameter("city", "%" + city + "%");
        query.setParameter("district", "%" + district + "%");
        query.setParameter("min", min);
        query.setParameter("max", max);
        return query.getResultList();
    }


}