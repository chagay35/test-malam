package com.example.testmalam.persontest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MailCorrector implements Corrector {

    @Autowired
    private DefaultService ds;

    @Override
    public void correct(Person person) {
        String email = person.getEmail();
        if (email == null || !email.contains("@") ||!email.contains(".") ||email.indexOf("@") > email.indexOf(".")) {
            person.setEmail(new DefaultService().defVal.get("email"));
        }

    }
}
