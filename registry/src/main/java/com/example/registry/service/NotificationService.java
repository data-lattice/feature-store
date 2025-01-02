package com.example.registry.service;

import com.example.registry.domain.Notification;
import com.example.registry.repo.NotificationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotificationService {
    private final NotificationRepository repo;
    public NotificationService(NotificationRepository repo) { this.repo = repo; }
    public List<Notification> all() { return repo.findAll(); }
    public Notification get(Long id) { return repo.findById(id).orElseThrow(); }
    public Notification save(Notification e) { return repo.save(e); }
}
