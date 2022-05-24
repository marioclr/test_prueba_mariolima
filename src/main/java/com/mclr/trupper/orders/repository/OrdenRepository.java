package com.mclr.trupper.orders.repository;

import com.mclr.trupper.orders.model.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepository extends JpaRepository<Orden, Integer> {
}
