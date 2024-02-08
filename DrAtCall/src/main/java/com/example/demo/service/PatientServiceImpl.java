package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.beans.Patient;
import com.example.demo.dao.PatientDao;

public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientDao patientDao;

	@Override
	public List<Patient> getAllPatients() {
	
		return patientDao.findAll();
	}

	@Override
	public Patient getById(int patientId) {
		
		Optional<Patient> p=patientDao.findById(patientId);
		
		if(p.isPresent())
		{
			return p.get();
		}
		
		return null;
	}

}
