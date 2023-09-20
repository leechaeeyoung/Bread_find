package com.example.Bread_find.controller;

import com.example.Bread_find.service.KakaoService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.Map;

@Controller
public class KakaoController {
    @Autowired
    KakaoService ks;

    @GetMapping("/main")
    public String mainPage(){
        return "main";
    }
    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/kakao")
    public String getCI(@RequestParam String code, Model model) throws IOException, ParseException {
        System.out.println("code = "+code);
        String access_token = ks.getToken(code);
        Map<String, Object> userInfo = ks.getUserInfo(access_token);
        model.addAttribute("code",code);
        model.addAttribute("access_token", access_token);
        model.addAttribute("userInfo",userInfo);

        // ci 비지니스 전환후 검수신청
        return "index";
    }
}