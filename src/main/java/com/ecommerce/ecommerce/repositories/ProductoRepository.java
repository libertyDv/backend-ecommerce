package com.ecommerce.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
