package com.stockqr.backend.repository;

import com.stockqr.backend.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio de Producto.
 * Permite realizar operaciones CRUD automáticamente.
 */
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // No hace falta escribir nada aquí por ahora
}
