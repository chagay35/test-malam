package com.example.testmalam.persontest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private int age;
    private String email;

    LocalDate getBirthday(){
        LocalDate y = LocalDate.now();
        int year = y.getYear();
        LocalDate ld = LocalDate.of(year-age,1,1);
        return ld;
    }
    String getBirthdayAsText(){
        return getBirthday().toString();
    }
}
