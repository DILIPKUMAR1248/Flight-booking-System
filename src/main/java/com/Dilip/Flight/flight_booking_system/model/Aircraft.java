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
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="AIRCRAFT")

public class Aircraft {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long arcraftId;
	 private String manufacturer;
	 private String model;
	 private Integer numberOfSeats;
	 
	 @OneToMany(mappedBy = "aircraft", cascade = { CascadeType.ALL })
	 private List<Flight> flights=new ArrayList<Flight>();
	 
	 

}
