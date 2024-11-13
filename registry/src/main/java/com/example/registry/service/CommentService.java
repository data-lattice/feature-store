package com.example.registry.service;

import com.example.registry.domain.Comment;
import com.example.registry.repo.CommentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CommentService {
    private final CommentRepository repo;
    public CommentService(CommentRepository repo) { this.repo = repo; }
    public List<Comment> all() { return repo.findAll(); }
    public Comment get(Long id) { return repo.findById(id).orElseThrow(); }
    public Comment save(Comment e) { return repo.save(e); }
}
