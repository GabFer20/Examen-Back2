package com.example.parcial2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CineRepository extends JpaRepository<Cine, Long> {
    @Query("SELECT c FROM Cine c WHERE c.ciudad = ?1")
    List<Cine> findByCiudad(String ciudad);
}
