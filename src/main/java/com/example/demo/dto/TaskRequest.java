package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TaskRequest {
    private String name;
    private String description;
    private LocalDateTime deadline;

}
