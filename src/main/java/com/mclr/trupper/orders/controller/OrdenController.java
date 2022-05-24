package com.mclr.trupper.orders.controller;

import com.mclr.trupper.orders.model.Orden;
import com.mclr.trupper.orders.model.Producto;
import com.mclr.trupper.orders.model.Sucursal;
import com.mclr.trupper.orders.services.IOrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/trupper")
public class OrdenController {

    @Autowired
    IOrdenService ordenService;

    @PostMapping("/ordenes")
    void agregarOrden() {

        List<Producto> productoList = new ArrayList<>();

        Producto producto1 = new Producto(null, "18156", "Esmeriladora angular", 625D);
        Producto producto2 = new Producto(null, "17193", "Pala redonda", 100.50D);

        productoList.add(producto1);
        productoList.add(producto2);

        Sucursal sucursal = new Sucursal(null, "CDMX");

        Orden ordenCDMX = new Orden();

        ordenCDMX.setSucursal(sucursal);
        ordenCDMX.setProuctos(productoList);
        //ordenCDMX.setFecha(Date);

        ordenService.guardar(ordenCDMX);

    }
}
