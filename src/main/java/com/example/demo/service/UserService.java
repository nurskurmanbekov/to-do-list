package com.example.demo.service;

import com.example.demo.dto.UserRequest;
import com.example.demo.dto.auth.AuthResponse;
import com.example.demo.dto.auth.LoginRequest;
import com.example.demo.dto.auth.RegisterRequest;

public interface UserService {

    void register(RegisterRequest request);

    AuthResponse login(LoginRequest request);
}
