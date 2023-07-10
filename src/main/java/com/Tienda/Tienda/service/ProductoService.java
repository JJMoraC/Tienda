package com.Tienda.Tienda.service;

import com.Tienda.Tienda.domain.Producto;
import java.util.List;

public interface ProductoService {

    // Método para consultar las productos. El parámetro define si se muestran solo las activas o todas
    public List<Producto> getProductos(boolean activos);

    // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);

    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);

    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
}
