package it.open1.patient.manager.repository;

import it.open1.patient.manager.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {


}
