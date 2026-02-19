//package controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.buspass.buspass.repository.UserRepository;
//import com.buspass.buspass.service.UserService;
//
//import org.springframework.web.bind.annotation.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import com.buspass.buspass.service.UserService;
//import com.buspass.buspass.entity.User;
//
//@RestController
//@RequestMapping("/api/auth")
//public class AuthController {
//    @Autowired
//        private UserService service;
//    private UserRepository repo;
//
//    @PostMapping("/register")
//        public User register(@RequestBody User user){
//            return service.register(user);
//        }
//
//    @PostMapping("/login")
//    public String login(@RequestBody User user){
//        User existing = repo.findByEmail(user.getEmail());
//        if(existing != null && encoder.matches(user.getPassword(), existing.getPassword())){
//            return "Login Successful";
//        }
//        return "Invalid Credentials";
//    }
//
////    public User register(@Valid @RequestBody User user)
//
//
//}
//
//
package com.buspass.buspass.controller;

import com.buspass.buspass.config.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.buspass.buspass.service.UserService;
import com.buspass.buspass.repository.UserRepository;
import com.buspass.buspass.entity.User;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService service;

    @Autowired
    private UserRepository repo;

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        User existing = repo.findByEmail(user.getEmail());
        if (existing != null &&
                encoder.matches(user.getPassword(), existing.getPassword())) {
            return jwtUtil.generateToken(existing.getEmail());
        }
        return "Invalid Credentials";
    }
}
