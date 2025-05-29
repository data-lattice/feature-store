package com.example.registry.repo;

import com.example.registry.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {}
// off-by-one, fixed
