package com.crud.ex.controller;

import com.crud.ex.entity.Registration;
import com.crud.ex.service.RegistrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/registration")
public class RegistrationController {

private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    //http://localhost:8080/api/v1/registration/add
    @PostMapping("/add")
    public ResponseEntity<Registration> addRegistration(
            @RequestBody Registration registration
    ){
        Registration reg = registrationService.addRegistration(registration);
        return new ResponseEntity<>(reg, HttpStatus.CREATED);
    }


}
