package com.example.registration.auth;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
//@Builder
@RequiredArgsConstructor
//@NoArgsConstructor
public class AuthenticationRequest {
    private String email;
    private String password;
}
