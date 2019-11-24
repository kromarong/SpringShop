package ru.kromarong.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String registerPage(){
        return "register";
    }
}
