package com.mclr.trupper.orders.controller;

import com.mclr.trupper.orders.model.Sucursal;
import com.mclr.trupper.orders.services.ISucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalController {

    @Autowired
    ISucursalService service;

    @GetMapping("/mostrar")
    List<Sucursal> muestraSucursal() {
        return service.buscarTodos();
    }

    @PostMapping("/agregar")
    void agregSucursal(@RequestBody Sucursal sucursal) {
        service.guardar(sucursal);
    }

    @DeleteMapping("/eliminar/{id}")
    void eliminarSucursal(@PathVariable Integer id) {
        service.eliminar(id);
    }
}
