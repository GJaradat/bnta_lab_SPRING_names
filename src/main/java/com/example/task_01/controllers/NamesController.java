package com.example.task_01.controllers;


import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class NamesController {

    @GetMapping
    public String greet(){
        Greeting greeting = new Greeting("Colin","afternoon");
        return String.format("Good %s %s!", greeting.getTimeOfDay(), greeting.getName());
    }


}
