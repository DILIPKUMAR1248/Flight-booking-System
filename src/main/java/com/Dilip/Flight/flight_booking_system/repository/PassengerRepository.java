package com.Dilip.Flight.flight_booking_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Dilip.Flight.flight_booking_system.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {
	

}
