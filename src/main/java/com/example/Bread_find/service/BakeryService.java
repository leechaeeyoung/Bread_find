package com.example.Bread_find.service;

import com.example.Bread_find.repository.BakeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 빵집과 관련된 비지니스 로직 처리하는 서비스
@Service
public class BakeryService {
    private final BakeryRepository bakeryRepository;

    @Autowired
    public BakeryService(BakeryRepository bakeryRepository) {
        this.bakeryRepository = bakeryRepository;
    }

}
