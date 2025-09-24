package com.example.PresenceService.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "presence")
@Getter
@Setter
public class Presence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private boolean online;

    
    public Presence() {
    }

    
    public Presence(Long userId, boolean online) {
        this.userId = userId;
        this.online = online;
    }

}