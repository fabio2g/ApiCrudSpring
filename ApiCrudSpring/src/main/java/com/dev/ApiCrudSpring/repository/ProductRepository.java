package com.dev.ApiCrudSpring.repository;

import com.dev.ApiCrudSpring.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
