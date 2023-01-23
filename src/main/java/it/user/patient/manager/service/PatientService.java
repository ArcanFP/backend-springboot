package it.open1.patient.manager.service;

import it.open1.patient.manager.exceptions.PatientNotFoundException;
import it.open1.patient.manager.model.Patient;
import it.open1.patient.manager.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }


    //____________________________________ADD PATIENT______________________________

    public Patient addPatient(Patient patient) {
        patient.setPatientCode(UUID.randomUUID().toString());
        return patientRepository.save(patient);

    }
//_________________________________GET PATIENT____________________________________

    public List<Patient> findAllPatients() {
        return patientRepository.findAll();
    }


    //__________________________________UPDATE PATIENT____________________________________

    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    //_____________________________________FIND PATIENT___________________________________________
    public Patient findPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new PatientNotFoundException("User by id " + id + " not found"));
    }


//_____________________________________DELETE PATIENT_____________________________-

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);

    }


}
