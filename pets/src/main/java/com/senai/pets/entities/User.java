package com.senai.pets.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private UserStatus userStatus;
    
}
