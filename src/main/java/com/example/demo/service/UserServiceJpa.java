package com.example.demo.service;

import com.example.demo.dto.UserRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceJpa implements UserService{
    private final UserRepository userRepository;

    @Override
    public void add(UserRequest request) {
        if (userRepository.findByEmail(request.getEmail()).isEmpty()){
            User user = new User();
            user.setEmail(request.getEmail());
            user.setName(request.getName());
            userRepository.save(user);
        }
        else {
            System.out.println("user with this email is already exist!");
        }
    }
}
