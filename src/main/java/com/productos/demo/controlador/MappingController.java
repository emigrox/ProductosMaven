package com.productos.demo.controlador;

import com.productos.demo.servicio.ProductoService;
import com.productos.demo.modelo.Producto;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingController {
    @Autowired
    private ProductoService mapService;

    public MappingController() {
    }

    @GetMapping({"/producto"})
    @ResponseBody
    public List<Producto> getAllProductos() {
        List<Producto> productos = this.mapService.getAllProductos();
        return productos;
    }

    @GetMapping({"/producto/{id}"})
    private Producto getProducto(@PathVariable("id") int id) {
        return this.mapService.getProductoById(id);
    }

    @DeleteMapping({"/producto/{id}"})
    private void deleteProducto(@PathVariable("id") int id) {
        this.mapService.delete(id);
    }

    @PostMapping({"/producto"})
    private int saveProducto(@RequestBody Producto producto) {
        this.mapService.saveOrUpdate(producto);
        return producto.getId();
    }
}
