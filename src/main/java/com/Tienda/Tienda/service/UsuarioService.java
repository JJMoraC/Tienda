package com.Tienda.Tienda.service;

import com.Tienda.Tienda.domain.Usuario;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public interface UsuarioService {
    
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    public Usuario getUsuarioPorUsername(String username);
}
