package com.stockqr.backend.model;

import jakarta.persistence.*;

/**
 * Entidad Producto
 * Representa un producto dentro del sistema de gestión de stock.
 * Esta clase se mapea automáticamente a una tabla en la base de datos.
 */
@Entity
@Table(name = "productos")
public class Producto {

    /**
     * ID único del producto.
     * Se genera automáticamente.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nombre del producto.
     */
    @Column(nullable = false)
    private String nombre;

    /**
     * Descripción del producto.
     */
    private String descripcion;

    /**
     * Cantidad disponible en stock.
     */
    private int cantidad;

    /**
     * Código QR asociado al producto.
     * Más adelante aquí guardaremos el valor del QR.
     */
    private String codigoQr;

    // ===== CONSTRUCTORES =====

    public Producto() {
        // Constructor vacío obligatorio para JPA
    }

    public Producto(String nombre, String descripcion, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    // ===== GETTERS Y SETTERS =====

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigoQr() {
        return codigoQr;
    }

    public void setCodigoQr(String codigoQr) {
        this.codigoQr = codigoQr;
    }
}
