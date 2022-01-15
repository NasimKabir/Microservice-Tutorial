package com.spring.cloudApiGateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    @GetMapping("/falluser")
    public  String fallBackMethodUser(){
        return "User service is taking....?  Please try again.";
    }

    @GetMapping("/falldepartment")
    public  String fallBackMethodDepartment(){
        return "Department service is taking....?  Please try again.";
    }
}
