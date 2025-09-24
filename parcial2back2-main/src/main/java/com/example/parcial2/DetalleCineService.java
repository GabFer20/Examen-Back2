package com.example.parcial2;

import org.springframework.stereotype.Service;

@Service
public class DetalleCineService {
    private final DetalleCineRepository detalleCineRepository;

    public DetalleCineService(DetalleCineRepository detalleCineRepository) {
        this.detalleCineRepository = detalleCineRepository;
    }

    public DetalleCine guardar(DetalleCine detalleCine) {
        return detalleCineRepository.save(detalleCine);
    }
}
