package com.example.contactApi;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="contact")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="contact_id")
	private long contactId;
	
    @JsonProperty("firstName")  
	@Column(name="first_name", nullable=false)
	private String firstName;
	
    @JsonProperty("lastName") 
    @Column(name="last_name")
	private String lastName;
	
    @JsonProperty("email") 
    private String email;
    
    @JsonProperty("phoneNumber") 
	@Column(name="phone_number", nullable=false)
	private String phoneNumber;
}
