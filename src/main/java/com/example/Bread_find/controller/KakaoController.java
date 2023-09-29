package com.example.Bread_find.controller;

import com.example.Bread_find.service.KakaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KakaoController {
    @Autowired
    private KakaoService kakao;
    @GetMapping("/main")
    public String mainPage(){
        return "main";
    }
    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @RequestMapping(value = "member/kakao")
    public String kakaoCallback(@RequestParam("code") String code) {
//        System.out.println("code : "+code);
        String access_Token = kakao.getAccessToken(code);
        System.out.println("controller access_token : "+access_Token);
        return "index";
    }

}