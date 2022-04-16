package com.productos.demo.modelo;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Producto {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int id;
    @Column
    @NotEmpty
    @Size(min = 3, max = 100, message
            = "Nombre del producto debe ser menor a 100 caracteres y mayor que 3 ")
    private String nombre;
    @Column
    @Size(max = 5000, message
            = "Descripcion del producto debe ser menor a 5000 caracteres")
    private String descripcion;
    @Column
    @Positive
    private float precio;
    @Column
    private String fechaCreacion;

    public Producto() {
    }

    public void producto() {
    }

    public void producto(int id, String nombre, String descripcion, float precio,String fechaCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fechaCreacion = fechaCreacion;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setFechaCreacion(String fecha) {
        this.fechaCreacion = fecha;
    }
}
