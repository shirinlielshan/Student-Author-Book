package com.example.studentbook.auth;


import com.example.studentbook.domain.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {
    
    private String username;
    private String password;
    private int age;
    private Role role;
}
