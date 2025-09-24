package com.example.parcial2;

import org.springframework.stereotype.Service;

@Service
public class CineService {
    private final CineRepository cineRepository;

    public CineService(CineRepository cineRepository) {
        this.cineRepository = cineRepository;
    }

    public Cine guardar(Cine cine) {
        return cineRepository.save(cine);
    }
}
