package com.productos.demo.controlador;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class ProductoNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(ProductoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String ProductoNotFoundHandler(ProductoNotFoundException ex) {
        return ex.getMessage();
    }
}