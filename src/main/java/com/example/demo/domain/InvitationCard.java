package com.example.demo.domain;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="InvitationCard")
public class InvitationCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int invitationCardId;
    @Column(name ="design_id")
    private int designId;

    @Column(name ="groom_name")
    private String groomName;
    @Column(name ="bride_name")
    private String brideName;

    private String message;

    @Column(name="wedding_date")
    private Date weddingDate;

    private String address;

    @Column(name="user_id")
    private int userId;



    public int getInvitationCardId() {
        return invitationCardId;
    }

    public int getDesignId() {
        return designId;
    }

    public String getGroomName() {
        return groomName;
    }

    public String getBrideName() {
        return brideName;
    }

    public String getMessage() {
        return message;
    }

    public Date getWeddingDate() {
        return weddingDate;
    }

    public String getAddress() {
        return address;
    }

    public int getUserId() {
        return userId;
    }

    // Setter 메서드
    public void setInvitationCardId(int invitationCardId) {
        this.invitationCardId = invitationCardId;
    }

    public void setDesignId(int designId) {
        this.designId = designId;
    }

    public void setGroomName(String groomName) {
        this.groomName = groomName;
    }

    public void setBrideName(String brideName) {
        this.brideName = brideName;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setWeddingDate(Date weddingDate) {
        this.weddingDate = weddingDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }



}
