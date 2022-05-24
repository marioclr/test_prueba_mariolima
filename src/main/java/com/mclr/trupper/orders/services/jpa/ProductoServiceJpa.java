package com.mclr.trupper.orders.services.jpa;

import com.mclr.trupper.orders.model.Producto;
import com.mclr.trupper.orders.repository.ProductoRepository;
import com.mclr.trupper.orders.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceJpa implements IProductoService {

    @Autowired
    private ProductoRepository repository;

    @Override
    public void guardar(Producto producto) {
        repository.save(producto);
    }

    @Override
    public void eliminar(Integer idProducto) {
        repository.deleteById(idProducto);
    }

    @Override
    public List<Producto> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public Producto buscarPorId(Integer idProducto) {
        Optional<Producto> optionalProducto = repository.findById(idProducto);
        if (optionalProducto.isPresent()) {
            return optionalProducto.get();
        }
        return null;
    }
}
