package com.Dilip.Flight.flight_booking_system.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(nullable = false)
	@NotBlank(message = "* First Name is required")
	private String firstName;

	@Column(name = "middlename", nullable = true)
	private String middleName;

	@Column(nullable = false)
	@NotBlank(message = "* Last Name is required")
	private String lastName;

	@Column(unique = true, nullable = false)
	@NotBlank(message = "* Username is required")
	private String userName;
	
	@Column(nullable=false,unique =true)
	@NotBlank(message="* Password is requried")
	@Email(message="{error.invalid_email}")
   private String email;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "users_roles", joinColumns = {
			@JoinColumn(name = "USER_ID", referencedColumnName = "ID") }, inverseJoinColumns = {
					@JoinColumn(name = "ROLE_ID", referencedColumnName = "ID") })
	private List<Role> roles;
	

}
