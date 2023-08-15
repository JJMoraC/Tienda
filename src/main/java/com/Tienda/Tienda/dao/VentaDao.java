package com.Tienda.Tienda.dao;

import com.Tienda.Tienda.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaDao extends JpaRepository<Venta, Long> {
    
}
