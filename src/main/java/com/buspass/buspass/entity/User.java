//package entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import lombok.Data;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//
//
//
//
//@Entity
//@Data
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
////    private String name;
////    private String email;
//    private String password;
//    private String role;
//
//    @NotBlank
//    private String name;
//
//    @Email
//    private String email;
//// STUDENT or ADMIN
//}
package com.buspass.buspass.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;

    private String role; // STUDENT or ADMIN
}
