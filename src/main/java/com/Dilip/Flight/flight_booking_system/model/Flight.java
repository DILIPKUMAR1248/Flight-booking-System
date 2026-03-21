package com.Dilip.Flight.flight_booking_system.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "FLIGHT")
public class Flight {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long flightId;
	
	@DateTimeFormat(pattern="yy-MM-dd")
	private LocalDate arrivalDate;
	
	private String arrivalTime;
	
	@DateTimeFormat(pattern="yy-MM-dd")
	private LocalDate DepartureDate;
	
	private String departureTime;
	
	private Double flightCharge;
	
	private String flightNumber;
	
	@ManyToOne
	private Aircraft aircraft;
	
	@ManyToOne
	private Airport departureAirport;
	
	@ManyToOne
	private Airport destinationAirport;
	
	@OneToMany(mappedBy="flight",cascade= {CascadeType.ALL})
	private List<Passenger> passengers=new ArrayList<Passenger>();

}
