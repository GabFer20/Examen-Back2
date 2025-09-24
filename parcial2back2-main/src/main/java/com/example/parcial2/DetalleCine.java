package com.example.parcial2;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalleCine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private double precioEntrada;

    @ManyToOne
    @JoinColumn(name = "sala_id")
    private Sala sala;
}
