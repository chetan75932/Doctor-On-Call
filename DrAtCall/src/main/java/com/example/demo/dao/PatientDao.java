package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.beans.Patient;

public interface PatientDao extends JpaRepository<Patient,Integer>{

}
