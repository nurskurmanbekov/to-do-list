package com.example.demo.service;

import com.example.demo.dto.UserRequest;
import com.example.demo.dto.auth.RegisterRequest;

public interface UserService {

    void register(RegisterRequest request);
}
