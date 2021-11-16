package com.example.testmalam.persontest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonCorrectorImpl implements PersonCorrector{
    @Autowired
    private List<Corrector> correctors;

    @Override
    public void correct(Person person) {
        for (Corrector corrector : correctors) {
            corrector.correct(person);
        }
    }
}
