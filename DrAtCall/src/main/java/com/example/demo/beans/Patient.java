package com.example.demo.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="DoctorsDetails")
@NoArgsConstructor
@Getter
@Setter
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private int patientId;
	
     private String patientName;
     private String patientEmail;
     private String password;
     private String patientPhoneNumber;
     private String patientAddress;
     private String patientPhoto;
}
