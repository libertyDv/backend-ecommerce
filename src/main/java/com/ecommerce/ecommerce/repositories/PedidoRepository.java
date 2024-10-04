package com.ecommerce.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    
}
