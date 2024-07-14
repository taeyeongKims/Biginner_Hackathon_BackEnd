package com.example.demo.controller;

import com.example.demo.domain.InvitationCard;
import com.example.demo.service.InvitationCardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/invitationCard")
public class InvitationCardController {
    private final InvitationCardService invitationCardService;

    public InvitationCardController(InvitationCardService invitationCardService){
        this.invitationCardService = invitationCardService;
    }

    @GetMapping("/{userId}/{invitationId}")
    public InvitationCard getInvitationCard(@PathVariable int invitationId){
        return invitationCardService.getInvitationCard(invitationId);
    }

    @PostMapping("/create")
    public InvitationCard createInvitationCard(@RequestBody InvitationCard invitationCard){
        System.out.println(invitationCard.getBrideName());
        return invitationCardService.createInvitationCard(invitationCard);
    }
}
