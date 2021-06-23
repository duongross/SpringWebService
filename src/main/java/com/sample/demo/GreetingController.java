package com.sample.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        int id = 123;
        return new Greeting(id,name);
    }
    @PostMapping("/sendgreeting")
    public void sendGreeting(@RequestBody Greeting greeting){
        System.out.println(greeting.toString());
    }
}
