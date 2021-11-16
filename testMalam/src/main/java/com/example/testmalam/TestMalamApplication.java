package com.example.testmalam;

import com.example.testmalam.persontest.Corrector;
import com.example.testmalam.persontest.Person;
import com.example.testmalam.persontest.PersonCorrector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestMalamApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(TestMalamApplication.class, args);
        Person person = Person.builder().age(-22).name("").email("dude@email.com").build();
        Person persom = Person.builder().age(-22).name("").email("dude@email.com").build();
        PersonCorrector corrector =  context.getBean(PersonCorrector.class);
        corrector.correct(person);
        corrector.correct(persom);
        System.out.println(person.toString());
        System.out.println(persom.toString());
    }

}
