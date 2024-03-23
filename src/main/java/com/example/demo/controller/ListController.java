package com.example.demo.controller;

import com.example.demo.dto.TaskRequest;
import com.example.demo.dto.TaskResponse;
import com.example.demo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/to-do-list")
@RequiredArgsConstructor
public class ListController {
    private final TaskService service;

    @PostMapping("/add/{userId}")
    public void add(@RequestBody TaskRequest request, @PathVariable Long userId){
        service.add(request, userId);
    }

    @GetMapping("/userTasks/{userId}")
    public List<TaskResponse> userTasks(@PathVariable Long userId){
        return service.userTasks(userId);
    }
    @PostMapping("/update/{taskId}")
    public void update(@RequestBody TaskRequest request, @PathVariable Long taskId){
        service.update(request, taskId);
    }
    @PostMapping("/setStatus/{taskId}")
    public void setStatus(@PathVariable Long taskId, @RequestParam String taskStatus){
        service.setStatus(taskId, taskStatus);
    }
    
}
