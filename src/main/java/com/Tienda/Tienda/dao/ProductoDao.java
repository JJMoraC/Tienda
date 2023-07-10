package com.Tienda.Tienda.dao;

import com.Tienda.Tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto, Long>{
    // Más adelante vamos a crear métodos ampliados
}
