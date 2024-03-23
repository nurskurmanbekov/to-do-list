package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private LocalDateTime addedDate;
    private LocalDateTime updatedDate;
    private LocalDateTime deadline;
    @ManyToOne
    private TaskStatus taskStatus;
}
