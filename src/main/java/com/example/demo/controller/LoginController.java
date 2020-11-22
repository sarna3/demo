package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @PostMapping(value = "/check")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password) {
        if(username.equals("admin") && password.equals("123"))
        {
            return "list";
        }
        else
            return "redirect:/login.html";
    }
}

