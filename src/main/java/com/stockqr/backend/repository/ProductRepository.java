package com.stockqr.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.stockqr.backend.model.Product;

/**
 * Acceso a la base de datos para productos
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
