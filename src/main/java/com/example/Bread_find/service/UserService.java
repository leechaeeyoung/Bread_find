package com.example.Bread_find.service;

import com.example.Bread_find.entity.User;
import com.example.Bread_find.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public User registerUser(User user){
        // id 중복 확인 로직
        Optional<User> existUser = userRepository.findByUserId(user.getId());
        if(existUser.isPresent()){
            throw new IllegalArgumentException("이미 존재하는 아이디 입니다.");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}
