package com.example.testmalam.persontest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NameCorrector implements Corrector {

    @Autowired
    private DefaultService ds;

    @Override
    public void correct(Person person) {
        if (person.getName() == null || person.getName().isEmpty()) {
            person.setName(ds.defVal.get("name")+ds.nameNum);
            ds.nameNum = ds.nameNum+1;
        }
    }
}
