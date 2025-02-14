package com.example.registry.service;

import com.example.registry.domain.AuditLog;
import com.example.registry.repo.AuditLogRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AuditLogService {
    private final AuditLogRepository repo;
    public AuditLogService(AuditLogRepository repo) { this.repo = repo; }
    public List<AuditLog> all() { return repo.findAll(); }
    public AuditLog get(Long id) { return repo.findById(id).orElseThrow(); }
    public AuditLog save(AuditLog e) { return repo.save(e); }
}
