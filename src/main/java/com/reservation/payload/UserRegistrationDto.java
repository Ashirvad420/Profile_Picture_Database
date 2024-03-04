package com.reservation.payload;


import lombok.Data;

@Data
public class UserRegistrationDto {
    private Long id;

    private String name;

    private String email;

    private String password;

    private byte[] profilePicture;
}
