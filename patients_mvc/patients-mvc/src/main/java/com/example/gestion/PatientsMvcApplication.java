package com.example.gestion;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.gestion.entities.Patient;
import com.example.gestion.repositories.PatientRepository;

@SpringBootApplication
public class PatientsMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientsMvcApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
		
		return args -> {
			patientRepository.save(
					new Patient(null,"Khadija",new Date(),false,12));
			patientRepository.save(
					new Patient(null,"Mohammed",new Date(),true,22));
			patientRepository.save(
					new Patient(null,"Fatiha",new Date(),false,32));
			patientRepository.save(
					new Patient(null,"Youssef",new Date(),true,42));
			
			patientRepository.findAll().forEach(p ->{
				
				System.out.println(p.getNom());
			});
		};
	}
}
