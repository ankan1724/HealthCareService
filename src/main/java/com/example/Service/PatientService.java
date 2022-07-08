package com.example.Service;

import com.example.Model.Patient;
import com.example.Model.RegisteredUser;
import com.example.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private RegisteredUser registeredUser;

    public Patient register(Long userid, String firstname, String lastname, Long contact,
                           String ailment) {
        Patient patient = new Patient();
            patient.setUserid(userid);
            patient.setPatientid((long) (Math.random() * 1000000L));
            patient.setContact(contact);
            patient.setFirstname(firstname);
            patient.setLastname(lastname);
            Date d = new Date(System.currentTimeMillis());
            patient.setAdmissiondate(d);
            patient.setAilment(ailment);
        return this.patientRepository.save(patient);
    }
       
    }