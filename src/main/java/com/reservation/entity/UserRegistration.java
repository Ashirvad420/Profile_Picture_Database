package com.reservation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "user_registration")
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String password;

    @Lob
    @Column(name = "profile_picture",columnDefinition = "LONGBLOB")
    private byte[] profilePicture;
}
