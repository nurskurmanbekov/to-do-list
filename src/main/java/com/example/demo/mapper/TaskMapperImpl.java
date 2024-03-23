package com.example.demo.mapper;

import com.example.demo.dto.TaskResponse;
import com.example.demo.entity.Task;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskMapperImpl implements TaskMapper{
    @Override
    public List<TaskResponse> toDtoS(List<Task> userTasks) {
        List<TaskResponse> taskResponses = new ArrayList<>();
        for (Task task: userTasks)
            taskResponses.add(toDto(task));
        return taskResponses;
    }

    @Override
    public TaskResponse toDto(Task task) {
        TaskResponse taskResponse = new TaskResponse();
        taskResponse.setId(task.getId());
        taskResponse.setName(task.getName());
        taskResponse.setDescription(task.getDescription());
        taskResponse.setAddedTime(task.getAddedDate());
        taskResponse.setDeadline(task.getDeadline());
        return taskResponse;
    }
}
