package com.example.demo.service;

import com.example.demo.dto.TaskRequest;
import com.example.demo.dto.TaskResponse;
import com.example.demo.entity.Task;
import com.example.demo.entity.User;
import com.example.demo.mapper.TaskMapper;
import com.example.demo.repository.TaskRepository;
import com.example.demo.repository.TaskStatusRepository;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskServiceJpa implements TaskService{
    private final TaskRepository repository;
    private final TaskStatusRepository taskStatusRepository;
    private final UserRepository userRepository;
    private final TaskMapper taskMapper;
    @Override
    public void add(TaskRequest request, Long userId) {

        Optional<User> user = userRepository.findById(userId);
        if (user.isEmpty())
            System.out.println("no user with id" + userId);
        else {
            Task task = new Task();
            task.setName(request.getName());
            task.setDescription(request.getDescription());
            task.setDeadline(request.getDeadline());
            task.setAddedDate(LocalDateTime.now());
            task.setTaskStatus(taskStatusRepository.findById(1L).get());
            repository.save(task);
            List<Task> userTasks = user.get().getTasks();
            userTasks.add(task);
            user.get().setTasks(userTasks);
            userRepository.save(user.get());
        }
    }

    @Override
    public List<TaskResponse> userTasks(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isEmpty()) {
            System.out.println("no user with id" + userId);
            return null;
        }

        else {
            List<Task> userTasks = user.get().getTasks();
            return taskMapper.toDtoS(userTasks);
        }
    }
}
