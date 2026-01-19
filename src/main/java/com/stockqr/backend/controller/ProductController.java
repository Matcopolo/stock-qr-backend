package com.stockqr.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador de prueba
 */
@RestController
public class ProductController {

    @GetMapping("/products/test")
    public String test() {
        return "Product API funcionando 🚀";
    }
}
