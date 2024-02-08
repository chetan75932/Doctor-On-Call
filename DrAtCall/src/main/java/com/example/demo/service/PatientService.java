package com.example.demo.service;

import java.util.List;

import com.example.demo.beans.Patient;

public interface PatientService {

	List<Patient> getAllPatients();

	Patient getById(int patientId);

}
