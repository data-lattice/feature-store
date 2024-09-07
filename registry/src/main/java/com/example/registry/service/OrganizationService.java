package com.example.registry.service;

import com.example.registry.domain.Organization;
import com.example.registry.repo.OrganizationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrganizationService {
    private final OrganizationRepository repo;
    public OrganizationService(OrganizationRepository repo) { this.repo = repo; }
    public List<Organization> all() { return repo.findAll(); }
    public Organization get(Long id) { return repo.findById(id).orElseThrow(); }
    public Organization save(Organization e) { return repo.save(e); }
}
