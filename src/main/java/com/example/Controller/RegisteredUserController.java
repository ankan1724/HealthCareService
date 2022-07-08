package com.example.Controller;

import com.example.Model.RegisteredUser;
import com.example.Service.RegisteredUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Register")
public class RegisteredUserController {
    @Autowired
     private com.example.Service.RegisteredUserService registeredUserService;
    
@PostMapping("/User")
@ApiOperation("To register a new user")
    private RegisteredUser register(@RequestParam(name="firstname", required = true) String firstname, 
                                    @RequestParam(name="lastname", required = true)String lastmane,
                                    @RequestParam(name="contact", required = false)Long contact,
                                    @RequestParam(name="email", required = true)String email,
                                    @RequestParam(name="password", required = true)String password){
        //System.out.println("Registration Successfull");
        return this.registeredUserService.register(firstname, lastmane,contact, email, password);
    }
}