package com.example.examenback2.service;

import com.example.examenback2.entity.Producto;
import com.example.examenback2.repository.ProductoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    public Producto guardar(Producto producto) {
        return repository.save(producto);
    }
}
