package com.productos.demo.controlador;

public class ProductoNotFoundException extends RuntimeException {

    public ProductoNotFoundException(Integer id) {
        super("No se encuentra el producto con id: " + id);
    }
}