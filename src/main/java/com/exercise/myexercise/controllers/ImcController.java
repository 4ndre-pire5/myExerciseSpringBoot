package com.exercise.myexercise.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exercise.myexercise.models.Person;
import com.exercise.myexercise.services.ImcService;

@RestController
@RequestMapping("/imc")
public class ImcController {

    @PostMapping("/calculate")
    public Person calculateImc(@RequestBody Person person ) {
        var svc = new ImcService();
        svc.calculate(person);
        
        return person;
        
    }
}
