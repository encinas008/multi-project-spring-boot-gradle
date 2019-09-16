package com.api.controllers;

import com.app.GreetingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    GreetingService greetingService = new GreetingService();

    @GetMapping(name = "Get all payments", value = "/spanish")
    public ResponseEntity getGreetingSpanish() {
        String result = greetingService.createGreeting();
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
