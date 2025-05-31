package com.example.registry.repo;

import com.example.registry.domain.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {}
// wip: idempotency-keys
