package com.stockqr.backend.model;

import jakarta.persistence.*;

/**
 * Representa un producto del sistema de stock
 */
@Entity
@Table(name = "products")
public class Product {

    // ID único del producto
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre del producto
    @Column(nullable = false)
    private String name;

    // Cantidad disponible en stock
    private int quantity;

    // Código QR (texto que luego se convertirá en imagen)
    @Column(unique = true)
    private String qrCode;

    // Constructor vacío (JPA lo necesita)
    public Product() {}

    // Constructor con datos
    public Product(String name, int quantity, String qrCode) {
        this.name = name;
        this.quantity = quantity;
        this.qrCode = qrCode;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
}
