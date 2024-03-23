package com.example.demo.service;

import com.example.demo.dto.TaskRequest;
import com.example.demo.dto.TaskResponse;

import java.util.List;

public interface TaskService {
    void add(TaskRequest request, Long userId);

    List<TaskResponse> userTasks(Long userId);

    void update(TaskRequest request, Long taskId);
}
