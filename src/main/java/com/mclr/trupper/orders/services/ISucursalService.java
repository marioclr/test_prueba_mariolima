package com.mclr.trupper.orders.services;

import com.mclr.trupper.orders.model.Sucursal;

import java.util.List;

public interface ISucursalService {
    void guardar (Sucursal sucursal);
    void eliminar (Integer idSucursal);
    List<Sucursal> buscarTodos();
    Sucursal buscarPorId(Integer idSucursal);
}
