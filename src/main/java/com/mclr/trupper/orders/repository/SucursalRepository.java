package com.mclr.trupper.orders.repository;

import com.mclr.trupper.orders.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {
}
