package com.example.parcial2;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int capacidad;

    @ManyToOne
    @JoinColumn(name = "cine_id")
    private Cine cine;

    @OneToMany(mappedBy = "sala", cascade = CascadeType.ALL)
    private List<DetalleCine> detalles;
}
