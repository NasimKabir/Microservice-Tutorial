package com.spring.usermanagement.controller;

import com.spring.usermanagement.model.User;
import com.spring.usermanagement.response.ResponseTemplateView;
import com.spring.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateView getUserIdWithDepartment(@PathVariable("id")long id){
        return userService.findByUserIdWithDepartments(id);
    }

}
