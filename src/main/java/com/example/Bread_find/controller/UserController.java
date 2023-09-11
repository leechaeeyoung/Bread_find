package com.example.Bread_find.controller;

import com.example.Bread_find.entity.User;
import com.example.Bread_find.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user){
        try {
            // 주석 처리된 코드 대신 userService.registerUser 메서드를 호출하지 않도록 수정
            return ResponseEntity.ok(user);
        } catch (IllegalArgumentException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

//    @PostMapping("/register")
//    public ResponseEntity<?> registerUser(@RequestBody User user){
//        try {
//            User registeredUser = userService.registerUser(user);
//            return ResponseEntity.ok(registeredUser);
//        } catch (IllegalArgumentException e){
//            return ResponseEntity.badRequest().body(e.getMessage());
//        }
//    }
}
