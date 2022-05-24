package com.mclr.trupper.orders.repository;

import com.mclr.trupper.orders.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
