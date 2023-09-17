package com.example.Bread_find.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KakaoController {
    @GetMapping("/main")
    public String mainPage(){
        return "main";
    }
    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
}