package com.example.examenback2.service;

import com.example.examenback2.entity.Usuario;
import com.example.examenback2.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario guardar(Usuario usuario) {
        return repository.save(usuario);
    }
}
