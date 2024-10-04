package com.ecommerce.ecommerce.model;

public enum Rol {
    CLIENTE("cliente"),
    ADMIN("admin");

    private String valor;

    Rol(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}