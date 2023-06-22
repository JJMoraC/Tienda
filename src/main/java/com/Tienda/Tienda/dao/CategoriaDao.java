package com.Tienda.Tienda.dao;

import com.Tienda.Tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    // Más adelante vamos a crear métodos ampliados
}
