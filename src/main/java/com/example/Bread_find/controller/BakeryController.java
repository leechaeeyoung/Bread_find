package com.example.Bread_find.controller;

import com.example.Bread_find.entity.Bakery;
import com.example.Bread_find.repository.BakeryRepository;
import com.example.Bread_find.service.BakeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bakeries")
public class BakeryController {
    private final BakeryService bakeryService;

    @Autowired
    public BakeryController(BakeryService bakeryService){
        this.bakeryService = bakeryService;
    }
}
