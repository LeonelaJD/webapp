package com.ilikes.webapp.controllers;

import com.ilikes.webapp.daos.entities.Product;
import com.ilikes.webapp.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("products")
    public List<Product> getProduct(){
        return productService.getProducts();
    }


    @GetMapping("app/saludo")
    public String HolaMundo(@RequestParam String name){

        String saludo = "Hola " + name;

        return saludo;
    }
}
