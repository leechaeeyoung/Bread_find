package com.example.Bread_find.repository;

import com.example.Bread_find.entity.Bakery;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

// spring data JPA 확장한 사용자 지정 레포지
// DB에서 빵집 데이터와 상호작용하는 메소드 정의
@Repository
public interface BakeryRepository extends JpaRepository<Bakery, Long> {
    Optional<Bakery> findByBakeryName(String name);
}
