package com.dev.ApiCrudSpring.controllers;

import com.dev.ApiCrudSpring.dto.RequestProductDTO;
import com.dev.ApiCrudSpring.repository.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository repository;
    @GetMapping
    public ResponseEntity getAllProducts() {
        var allProducts = repository.findAll();
        return ResponseEntity.ok(allProducts);
    }

    @PostMapping
    public ResponseEntity saveProduct(@RequestBody @Valid RequestProductDTO data) {
        System.out.println(data);
        return ResponseEntity.ok().build();
    }
}