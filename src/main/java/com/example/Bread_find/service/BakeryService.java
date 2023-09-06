package com.example.Bread_find.service;

import com.example.Bread_find.entity.Bakery;
import com.example.Bread_find.repository.BakeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 로작 처리(데이터 조작 및 가공)
@Service
public class BakeryService {
    private final BakeryRepository bakeryRepository;

    @Autowired
    public BakeryService(BakeryRepository bakeryRepository) {
        this.bakeryRepository = bakeryRepository;
    }

}
