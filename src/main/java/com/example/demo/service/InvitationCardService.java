package com.example.demo.service;

import com.example.demo.domain.InvitationCard;
import com.example.demo.repository.InvitationCardRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.NoSuchElementException;

@Service
public class InvitationCardService {
    private final InvitationCardRepository invitationCardRepository;

    public InvitationCardService(InvitationCardRepository invitationCardRepository){
        this.invitationCardRepository = invitationCardRepository;
    }

    public InvitationCard createInvitationCard(InvitationCard invitationCard){
        InvitationCard savedInvitationCard = invitationCardRepository.save(invitationCard);
        return savedInvitationCard;
    }

    public InvitationCard getInvitationCard(int invitationCardId){
        return invitationCardRepository.findById(invitationCardId).orElseThrow(()->new NoSuchElementException("Invitation card not found with id: " + invitationCardId));
    }

}
