package com.example.demo.repository;

import com.example.demo.entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface TaskStatusRepository extends JpaRepository<TaskStatus, Long> {
}
