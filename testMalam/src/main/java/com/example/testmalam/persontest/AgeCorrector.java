package com.example.testmalam.persontest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
public class AgeCorrector implements Corrector {
    @Autowired
    private DefaultService ds;

    @Override
    public void correct(Person person) {
        LocalDate ld = LocalDate.now();
        int age = person.getAge();
        if (age<0 || age>120 || age> ld.getYear()){
            person.setAge(Integer.parseInt(ds.defVal.get("age")));
        }
    }
}
