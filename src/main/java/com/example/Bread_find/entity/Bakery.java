package com.example.Bread_find.entity;

import javax.persistence.*;

// JPA Entity Class
// 데이터 베이스 테이블과 매핑되는 클래스
@Entity
@Table(name="HotPlace")
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
