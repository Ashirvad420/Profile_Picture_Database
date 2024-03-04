package com.reservation.service;

import com.reservation.entity.UserRegistration;
import com.reservation.payload.UserRegistrationDto;
import com.reservation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

   public UserRegistrationDto createUser(UserRegistration userRegistration)
    {
        userRepository.save(userRegistration);
        return null;
    }

    public UserRegistration getUserbyId(long id) {
       return userRepository.findById(id).get();
    }

    public byte[] getImageDataById(long id) {
       return userRepository.findById(id).get().getProfilePicture();
    }
}
