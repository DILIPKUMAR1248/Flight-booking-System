package com.Dilip.Flight.flight_booking_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PASSENGER")
public class Passenger {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer passengerId;
	
	private String email;
	
	@NotBlank(message = "* First Name is required")
	private String firstName;
	
	@NotBlank(message="*Last name is requried")
	private String lastName;
	
	@NotBlank(message="*Passanger numberis requried")
	private String passengerNumber;
	
	@NotBlank(message="*phone Number is requried")
	private String phoneNumber;
	
	
	
	@ManyToOne
	private Flight flight;
	
	
	
	
	
	

}
