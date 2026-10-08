package com.candidx.portal.dto.response;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDTOResponse {

    public UUID userId;
    public String userName;
    public int pinCode;
    public boolean registrationCompleted;
    public LocalDateTime createdAt;
    public String state;
}
