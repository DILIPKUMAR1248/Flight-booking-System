package com.Dilip.Flight.flight_booking_system.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Dilip.Flight.flight_booking_system.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
	
	public Optional<User> findByUsername(String username);

}
