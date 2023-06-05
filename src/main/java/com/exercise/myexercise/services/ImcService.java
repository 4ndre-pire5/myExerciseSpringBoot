package com.exercise.myexercise.services;

import com.exercise.myexercise.models.Person;

public class ImcService {
    public ImcService(){
        super();
    }  

    public void calculate(Person person){
        var imc = (person.getWeight() / (person.getHeight() * person.getHeight()));
        var description = "Obesidade";
        if (imc < 18.5) description = "Magreza";
        if (imc < 24.9) description = "Normal";
        if (imc < 30) description = "Sobrepeso";

        person.setImc(imc);
        person.setDescription(description);

    }
}
