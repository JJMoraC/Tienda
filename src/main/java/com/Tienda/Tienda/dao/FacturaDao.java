package com.Tienda.Tienda.dao;

import com.Tienda.Tienda.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaDao extends JpaRepository<Factura, Long> {
    
}
