package com.mclr.trupper.orders.services.jpa;

import com.mclr.trupper.orders.model.Orden;
import com.mclr.trupper.orders.repository.OrdenRepository;
import com.mclr.trupper.orders.services.IOrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdenServiceJpa implements IOrdenService {

    @Autowired
    private OrdenRepository repository;

    @Override
    public void guardar(Orden orden) {
        repository.save(orden);
    }

    @Override
    public void eliminar(Integer idOrden) {
        repository.deleteById(idOrden);
    }

    @Override
    public List<Orden> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public Orden buscarPorId(Integer idOrden) {
        Optional<Orden> optionalOrden = repository.findById(idOrden);
        if(optionalOrden.isPresent()) {
            return optionalOrden.get();
        }
        return null;
    }
}
