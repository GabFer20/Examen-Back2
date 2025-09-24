package com.example.examenback2.service;

import com.example.examenback2.entity.Pedido;
import com.example.examenback2.repository.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public Pedido guardar(Pedido pedido) {
        return repository.save(pedido);
    }
}
