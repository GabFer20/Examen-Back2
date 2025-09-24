package com.example.parcial2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface SalaRepository extends JpaRepository<Sala, Long> {
    @Query("SELECT s FROM Sala s WHERE s.capacidad > ?1")
    List<Sala> findSalasWithCapacidadGreaterThan(int capacidad);
}
