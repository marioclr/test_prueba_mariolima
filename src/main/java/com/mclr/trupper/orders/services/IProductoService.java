package com.mclr.trupper.orders.services;

import com.mclr.trupper.orders.model.Producto;

import java.util.List;

public interface IProductoService {
    void guardar (Producto orden);
    void eliminar (Integer idOrden);
    List<Producto> buscarTodos();
    Producto buscarPorId(Integer idOrden);
}
