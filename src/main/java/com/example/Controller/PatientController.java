package com.example.Controller;

import com.example.Model.Patient;
import com.example.Model.RegisteredUser;
import com.example.Service.PatientService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/Register")
public class PatientController {
    @Autowired
    private PatientService patientService;
    @Autowired
    private RegisteredUser registeredUser;
@PostMapping("/patient")
@ApiOperation("to add new patient")
    public Patient register(@RequestParam(name = "userid", required = true) Long userid,
                            @RequestParam(name = "firstname", required = true) String firstname,
                            @RequestParam(name = "lastname", required = true) String lastname,
                            @RequestParam(name = "contact", required = true) Long contact,
                            @RequestParam(name = "ailment", required = true) String ailment) {
    return this.patientService.register(userid, firstname,lastname, contact,ailment);
    
    }
}