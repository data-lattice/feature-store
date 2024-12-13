package com.example.registry.web;

import com.example.registry.domain.Invoice;
import com.example.registry.service.InvoiceService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {
    private final InvoiceService service;
    public InvoiceController(InvoiceService service) { this.service = service; }
    @GetMapping public List<Invoice> all() { return service.all(); }
    @GetMapping("/{id}") public Invoice get(@PathVariable Long id) { return service.get(id); }
    @PostMapping public Invoice create(@RequestBody Invoice e) { return service.save(e); }
}
