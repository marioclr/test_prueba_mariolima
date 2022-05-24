package com.mclr.trupper.orders.services;

import com.mclr.trupper.orders.model.Orden;

import java.util.List;

public interface IOrdenService {
    void guardar (Orden orden);
    void eliminar (Integer idOrden);
    List<Orden> buscarTodos();
    Orden buscarPorId(Integer idOrden);
}
