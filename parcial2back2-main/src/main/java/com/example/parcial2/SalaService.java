package com.example.parcial2;

import org.springframework.stereotype.Service;

@Service
public class SalaService {
    private final SalaRepository salaRepository;

    public SalaService(SalaRepository salaRepository) {
        this.salaRepository = salaRepository;
    }

    public Sala guardar(Sala sala) {
        return salaRepository.save(sala);
    }
}
