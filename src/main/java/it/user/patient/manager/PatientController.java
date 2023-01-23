package it.user.patient.manager;

import it.user.patient.manager.model.Patient;
import it.user.patient.manager.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/patients")

public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }


    @GetMapping(path = "/all")
    public ResponseEntity<List<Patient>> getAllPatients() {

        List<Patient> patients = patientService.findAllPatients();
        return new ResponseEntity<>(patients, HttpStatus.OK);

    }


//_____________________________________________FIND BY ID_______________________

    @GetMapping(path = "/find/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable("id") Long id) {

        Patient patient = patientService.findPatientById(id);
        return new ResponseEntity<>(patient, HttpStatus.OK);

    }

//___________________________________ADD_________________________



    @PostMapping(path = "/add")
    public ResponseEntity<Patient> addNewPatient (@RequestBody Patient patient)
    {


            Patient newPatient = patientService.addPatient(patient);
            return new ResponseEntity<>(newPatient, HttpStatus.CREATED);



    }

    //______________________________UPDATE_____________________________


    @PutMapping(path = "/update")
    public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient) {

        Patient updatePatient = patientService.updatePatient(patient);
        return new ResponseEntity<>(patient, HttpStatus.OK);

    }

    //___________________________________DELETE__________________


    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<?>deletePatient(@PathVariable("id") Long id) {

        patientService.deletePatient(id);
        return new ResponseEntity<>(HttpStatus.OK);


    }

}