package com.example.demo.mapper;

import com.example.demo.dto.TaskResponse;
import com.example.demo.entity.Task;

import java.util.List;

public interface TaskMapper {
    List<TaskResponse> toDtoS(List<Task> userTasks);

    TaskResponse toDto(Task task);
}
