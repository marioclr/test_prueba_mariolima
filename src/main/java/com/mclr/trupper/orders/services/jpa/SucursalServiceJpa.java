package com.mclr.trupper.orders.services.jpa;

import com.mclr.trupper.orders.model.Sucursal;
import com.mclr.trupper.orders.repository.SucursalRepository;
import com.mclr.trupper.orders.services.ISucursalService;
import org.hibernate.annotations.OptimisticLocking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SucursalServiceJpa implements ISucursalService {

    @Autowired
    private SucursalRepository sucursalRepository;

    @Override
    public void guardar(Sucursal sucursal) {
        sucursalRepository.save(sucursal);
    }

    @Override
    public void eliminar(Integer idSucursal) {
        sucursalRepository.deleteById(idSucursal);
    }

    @Override
    public List<Sucursal> buscarTodos() {
        return sucursalRepository.findAll();
    }

    @Override
    public Sucursal buscarPorId(Integer idSucursal) {
        Optional<Sucursal> optionalSucursal = sucursalRepository.findById(idSucursal);
        if (optionalSucursal.isPresent()){
            return optionalSucursal.get();
        }
        return null;
    }
}
