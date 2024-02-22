package com.example.task_01.controllers;


import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/greeting")
public class NamesController {

    @GetMapping
    @ResponseBody
    public String greet(@RequestParam (required = false) String timeOfDay){
        Greeting greeting = new Greeting("Colin",timeOfDay);
        if (greeting.getTimeOfDay() == null){
            greeting.setTimeOfDay("morning");
        }
        return String.format("Good %s %s!", greeting.getTimeOfDay(), greeting.getName());
    }

    @GetMapping(value = "/summer")
    public String celebrate(){
        Celebration yay = new Celebration("Happy summer solstice!");
        return yay.getMsg();
    }

}
