package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class TaskResponse {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime addedTime;
    private LocalDateTime deadline;


}
