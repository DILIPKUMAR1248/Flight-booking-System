package com.Dilip.Flight.flight_booking_system.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="AIRPORT")

public class Airport {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer airportId;
	private String airportCode;
	private String airportName;
	private String city;
	private String state;
	private String country;
	
	@OneToMany(mappedBy ="departureAirport", cascade= {CascadeType.ALL})
	private List<Flight> flights=new ArrayList<Flight>();
	
	@OneToMany(mappedBy="flight" ,cascade= {CascadeType.ALL})
	private List<Passenger> passengers=new ArrayList<Passenger>();
	

}
