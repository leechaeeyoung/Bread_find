package com.example.Bread_find.repository;

import com.example.Bread_find.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUser_id(String user_id); // 메서드 이름 변경
}

