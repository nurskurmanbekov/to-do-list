package com.example.demo.controller;

import com.example.demo.dto.UserRequest;
import com.example.demo.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;
    @PostMapping("/add")
    public void add(@RequestBody UserRequest request){
        service.add(request);
    }
}
