package com.example.gabSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @GetMapping("/")
    public String showHome() {

        return "home";
    }

    @GetMapping("/leaders")
    public String showLeaders(){

        return "leaders";
    }

    @GetMapping("/systems")
    public String showAdmins() {

        return "admins";
    }

    @GetMapping("/access-denied")
    public String showErrorPage() {
        return "access-denied";
    }

}
