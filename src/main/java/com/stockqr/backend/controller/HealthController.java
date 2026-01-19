package com.stockqr.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller de prueba
 * Sirve para verificar que el backend está levantado correctamente
 */
@RestController
public class HealthController {

    /**
     * Endpoint de prueba
     * URL: http://localhost:8080/api/health
     */
    @GetMapping("/api/health")
    public String health() {
        return "Backend Stock QR OK 🚀";
    }
}
