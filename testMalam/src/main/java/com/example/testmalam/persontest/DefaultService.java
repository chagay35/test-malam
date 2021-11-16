package com.example.testmalam.persontest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class DefaultService {
    //int age = 25;
    //String email = "support@malam.com";
    int nameNum = 1;
    //String name = "M"+nameNum;

    HashMap<String,String> defVal = new HashMap<String ,String>();
    DefaultService(){
        defVal.put("email","support@malam.com");
        defVal.put("age","25");
        defVal.put("name","M");
    }
}
