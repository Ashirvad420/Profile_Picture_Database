package com.reservation.repository;

import com.reservation.entity.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserRegistration,Long> {
}
