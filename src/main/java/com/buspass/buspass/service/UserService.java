//package service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import com.buspass.buspass.repository.UserRepository;
//
//import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.Autowired;
//import com.buspass.buspass.repository.UserRepository;
//import com.buspass.buspass.entity.User;
//
//@Service
//public class UserService {
//
////    @Autowired
////        private UserRepository repo;
////
////        public User register(User user){
////            return repo.save(user);
////        }
//
//    @Autowired
//    private PasswordEncoder encoder;
//
//    public User register(User user){
//        user.setPassword(encoder.encode(user.getPassword()));
//        return repo.save(user);
//    }
//
//}
//
//

package com.buspass.buspass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.buspass.buspass.repository.UserRepository;
import com.buspass.buspass.entity.User;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private PasswordEncoder encoder;

    public User register(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }
}
