package com.example.Service;

import com.example.Model.RegisteredUser;
import com.example.Repository.PatientRepository;
import com.example.Repository.RegisteredUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class RegisteredUserService {
    @Autowired private RegisteredUserRepository registeredUserRepository;
    @Autowired private PatientRepository patientRepository;


    public RegisteredUser register(String firstname, String lastname, Long contact, String email, String password) {
            RegisteredUser registeredUser = new RegisteredUser();
            registeredUser.setUserid((long) (Math.random() * 1000000L));
            registeredUser.setFirstname(firstname);
            registeredUser.setLastname(lastname);
            registeredUser.setEmail(email);
            registeredUser.setContact(contact);
            String encode = UUID.randomUUID().toString().substring(0, 9);
            registeredUser.setEncodedpassword("{bcrypt}"+new BCryptPasswordEncoder().encode(encode));
            this.registeredUserRepository.save(registeredUser);
            return registeredUser;
        }
        
       /* public Patient signin(String email, String password){
             
        Long userid=registeredUserRepository.findByUserName(email, password).getUserid();
         Long patientid=patientRepository.findByuserId(userid);
        if(userid==patientid){
           if(registeredUserRepository.findById(userid).isPresent()){
            return ;
        }*/
       
    }