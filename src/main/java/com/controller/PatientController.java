package com.controller;

import com.model.Patient;
import com.util.UssdUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ussd")
public class PatientController {

    private Patient patient;

    public PatientController(Patient patient){
        this.patient = patient;
    }
    @PostMapping("/")
    public ResponseEntity<Patient> mainMenu(@PathVariable String register){
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<Patient> requestFirstAid(@PathVariable String firstaid){
        return null;
    }

    public ResponseEntity<Patient> findHospital(@PathVariable String findHospital){
        return null;
    }
}
