package com.productos.demo.servicio;

import com.productos.demo.modelo.ProductoDTO;
import com.productos.demo.modelo.Producto;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductoMapper {
    ProductoMapper INSTANCE = Mappers.getMapper(ProductoMapper.class);

    
    ProductoDTO productoToProductoDTO(Producto producto);
}


