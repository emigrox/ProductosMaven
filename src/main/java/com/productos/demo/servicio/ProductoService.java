package com.productos.demo.servicio;


import com.productos.demo.controlador.ProductoNotFoundException;
import com.productos.demo.modelo.Producto;
import com.productos.demo.modelo.ProductoDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public ProductoService() {
    }


    public List<ProductoDTO> getAllProductos() {
        
        
        List<ProductoDTO> productosDto = new ArrayList();        

        this.productoRepository.findAll().forEach((producto) -> {

            
            productosDto.add(ProductoMapper.INSTANCE.productoToProductoDTO(producto));
        });
        return productosDto;
    }

    
 
  

    public Producto getProductoById(int id) {
        return (Producto)this.productoRepository.findById(id)
                .orElseThrow(() -> new ProductoNotFoundException(id));
    }

    public void saveOrUpdate(Producto producto) {
        this.productoRepository.save(producto);
    }

    public void delete(int id) {
        if(!productoRepository.existsById(id)){
            throw new ProductoNotFoundException(id);
        }
        this.productoRepository.deleteById(id);
    }
}
