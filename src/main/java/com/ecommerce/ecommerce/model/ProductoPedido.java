package com.ecommerce.ecommerce.model;

import jakarta.persistence.*;

@Entity
@Table(name = "productos_pedidos")
public class ProductoPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_prod_ped;

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    private Integer cantidad;
    private Double precio;

   
}