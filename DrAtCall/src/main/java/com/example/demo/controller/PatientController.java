package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Patient;
import com.example.demo.service.PatientService;

@RestController
@RequestMapping("/Patient")
public class PatientController {
	@Autowired
    private PatientService patientService;
	
	@GetMapping("/Patient")
	public ResponseEntity<List<Patient>> getAllPatients(){
		List<Patient> plist=patientService.getAllPatients();
		return ResponseEntity.ok(plist);
		
	}
	
	@GetMapping("/Patient/{patientId}")
	public ResponseEntity<Patient> getPatientById(@PathVariable int patientId){
		Patient p=patientService.getById(patientId);
		if (p!=null)
			return ResponseEntity.ok(p);
		else
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	/*@PostMapping("products/{pid}")
	public ResponseEntity<String> insertProduct(@RequestBody Product p){
		pservice.addnewProduct(p);
		return ResponseEntity.ok("data added successfully");
		
	}
	@PutMapping("products/{pid}")
	public ResponseEntity<String> updateProduct(@RequestBody Product p){
		pservice.updateById(p);
		return ResponseEntity.ok("data updated successfully");
		
	}
	@DeleteMapping("/products/{pid}")
	public ResponseEntity<String> removeById(@PathVariable int pid){
		pservice.deleteById(pid);
		return ResponseEntity.ok("data deleted successfully");
		
	}*/

}
