package com.ecommerce.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
