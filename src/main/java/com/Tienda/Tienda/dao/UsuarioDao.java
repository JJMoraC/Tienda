package com.Tienda.Tienda.dao;

import com.Tienda.Tienda.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository <Usuario, Long>{
    
    Usuario findByUsername (String username);
    
}
