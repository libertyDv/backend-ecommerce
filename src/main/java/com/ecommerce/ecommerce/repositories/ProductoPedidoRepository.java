package com.ecommerce.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.model.ProductoPedido;

public interface ProductoPedidoRepository extends JpaRepository<ProductoPedido, Long> {
    
}
