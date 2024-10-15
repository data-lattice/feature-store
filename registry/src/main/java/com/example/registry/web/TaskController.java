package com.example.registry.web;

import com.example.registry.domain.Task;
import com.example.registry.service.TaskService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService service;
    public TaskController(TaskService service) { this.service = service; }
    @GetMapping public List<Task> all() { return service.all(); }
    @GetMapping("/{id}") public Task get(@PathVariable Long id) { return service.get(id); }
    @PostMapping public Task create(@RequestBody Task e) { return service.save(e); }
}
