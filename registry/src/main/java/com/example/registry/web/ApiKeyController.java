package com.example.registry.web;

import com.example.registry.domain.ApiKey;
import com.example.registry.service.ApiKeyService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api_keys")
public class ApiKeyController {
    private final ApiKeyService service;
    public ApiKeyController(ApiKeyService service) { this.service = service; }
    @GetMapping public List<ApiKey> all() { return service.all(); }
    @GetMapping("/{id}") public ApiKey get(@PathVariable Long id) { return service.get(id); }
    @PostMapping public ApiKey create(@RequestBody ApiKey e) { return service.save(e); }
}
