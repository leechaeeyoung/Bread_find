package com.example.Bread_find.controller;

import com.example.Bread_find.service.BakeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// HTTP 요청 처리 spring REST Controller, 빵집과 관련된 요청 처리
// /api/bakeries 엔드포인트에 매핑
@RestController
@RequestMapping("/api/bakeries")
public class BakeryController {
    private final BakeryService bakeryService;

    @Autowired
    public BakeryController(BakeryService bakeryService){
        this.bakeryService = bakeryService;
    }
}
