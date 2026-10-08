package com.candidx.portal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
import java.time.LocalDateTime;

@Entity()
@Table(name = "users_details")
@Getter
@Setter
public class UserModel {

    @Id()
    private UUID userId;
    private String userName;
    private int pinCode;
    private boolean registrationCompleted;
    private LocalDateTime createdAt;
    private String state;

}
