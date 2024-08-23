package com.example.registry.web;

import com.example.registry.domain.User;
import com.example.registry.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;
    public UserController(UserService service) { this.service = service; }
    @GetMapping public List<User> all() { return service.all(); }
    @GetMapping("/{id}") public User get(@PathVariable Long id) { return service.get(id); }
    @PostMapping public User create(@RequestBody User e) { return service.save(e); }
}
