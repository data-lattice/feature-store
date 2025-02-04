package com.example.registry.service;

import com.example.registry.domain.ApiKey;
import com.example.registry.repo.ApiKeyRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ApiKeyService {
    private final ApiKeyRepository repo;
    public ApiKeyService(ApiKeyRepository repo) { this.repo = repo; }
    public List<ApiKey> all() { return repo.findAll(); }
    public ApiKey get(Long id) { return repo.findById(id).orElseThrow(); }
    public ApiKey save(ApiKey e) { return repo.save(e); }
}
