package com.example.Bread_find.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bakery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String jibun;

    public Bakery(Long id, String name, String address, String jibun) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.jibun = jibun;
    }
}
