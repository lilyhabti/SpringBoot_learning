package com.example.gestion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestion.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}
