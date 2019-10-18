package com.example.demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping
    public Principal getUser(Principal user) {
        return user;
    }
	
}