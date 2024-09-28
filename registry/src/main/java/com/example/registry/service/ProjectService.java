package com.example.registry.service;

import com.example.registry.domain.Project;
import com.example.registry.repo.ProjectRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository repo;
    public ProjectService(ProjectRepository repo) { this.repo = repo; }
    public List<Project> all() { return repo.findAll(); }
    public Project get(Long id) { return repo.findById(id).orElseThrow(); }
    public Project save(Project e) { return repo.save(e); }
}
