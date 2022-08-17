package com.example.gestion.web;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.gestion.entities.Patient;
import com.example.gestion.repositories.PatientRepository;

import lombok.AllArgsConstructor;

@Controller 
@AllArgsConstructor
public class PatientController {
	
	private PatientRepository patientRepository;
	
	@GetMapping(path="/index")
	public String patients(Model model) {
		
		List<Patient> patients = patientRepository.findAll();
		model.addAttribute("listPatients",patients);
		return "patients";
	}
}
