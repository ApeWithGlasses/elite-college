package com.example.colegioelite.servicios;

import com.example.colegioelite.dto.EstudianteDTO;
import com.example.colegioelite.entidades.Estudiante;
import com.example.colegioelite.mapas.EstudianteMapa;
import com.example.colegioelite.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServicioDTO implements ServicioBaseDTO<Estudiante,EstudianteDTO> {
    @Autowired
    protected EstudianteRepositorio estudianteRepositorio;

    @Autowired
    protected EstudianteMapa estudianteMapa;


    @Override
    public List<EstudianteDTO> buscarTodos() throws Exception {
        try {
            return estudianteMapa.mapearEstudiantes(estudianteRepositorio.findAll());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public EstudianteDTO buscarPorId(Integer id) throws Exception {
        return null;
    }

    @Override
    public EstudianteDTO registrar(Estudiante datosARegistrar) throws Exception {
        return null;
    }

    @Override
    public EstudianteDTO actualizar(Integer id, EstudianteDTO datosNuevos) throws Exception {
        return null;
    }

    @Override
    public Boolean eliminar(Integer id) throws Exception {
        return null;
    }
}
