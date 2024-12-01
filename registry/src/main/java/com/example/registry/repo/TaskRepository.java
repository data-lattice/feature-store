package com.example.registry.repo;

import com.example.registry.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {}
// check perf here
