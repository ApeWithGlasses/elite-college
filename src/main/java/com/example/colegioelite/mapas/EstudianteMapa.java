package com.example.colegioelite.mapas;

import com.example.colegioelite.dto.EstudianteDTO;
import com.example.colegioelite.entidades.Estudiante;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EstudianteMapa {
    @Mappings({
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "correo", target = "correo")
    })
    public EstudianteDTO mapearEstudiante(Estudiante estudiante);
    public List<EstudianteDTO> mapearEstudiantes(List<Estudiante> estudiantes);
}
