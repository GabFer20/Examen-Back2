package com.example.parcial2;

public class CineMapper {
    public static CineDTO toDTO(Cine cine) {
        return new CineDTO(cine.getId(), cine.getNombre(), cine.getCiudad());
    }

    public static Cine toEntity(CineDTO dto) {
        Cine cine = new Cine();
        cine.setId(dto.getId());
        cine.setNombre(dto.getNombre());
        cine.setCiudad(dto.getCiudad());
        return cine;
    }
}
