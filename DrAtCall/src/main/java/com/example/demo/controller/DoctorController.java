package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DoctorService;

@RestController
@RequestMapping("/Doctor")
public class DoctorController {
	@Autowired
    private DoctorService doctorService;
}
