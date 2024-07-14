package com.example.demo.repository;

import com.example.demo.domain.InvitationCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvitationCardRepository extends JpaRepository<InvitationCard, Integer> {
}
