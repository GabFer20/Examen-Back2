package com.example.parcial2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface DetalleCineRepository extends JpaRepository<DetalleCine, Long> {
    @Query("SELECT d FROM DetalleCine d WHERE d.precioEntrada < ?1")
    List<DetalleCine> findByPrecioEntradaLessThan(double precio);
}
