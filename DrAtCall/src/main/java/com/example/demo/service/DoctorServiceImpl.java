package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.DoctorDao;

public class DoctorServiceImpl implements DoctorService {
   @Autowired
   private DoctorDao doctordao;
}
