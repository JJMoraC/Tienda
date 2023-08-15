package com.Tienda.Tienda.dao;

import com.Tienda.Tienda.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long >{
    
    List<Categoria> findByDescripcion (String descripcion);
}
