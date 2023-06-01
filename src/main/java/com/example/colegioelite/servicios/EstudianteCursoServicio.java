package com.example.colegioelite.servicios;

import com.example.colegioelite.entidades.EstudianteCurso;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteCursoServicio implements ServicioBase<EstudianteCurso>{

    @Override
    public List<EstudianteCurso> buscarTodos() throws Exception {
        return null;
    }

    @Override
    public EstudianteCurso buscarPorId(Integer id) throws Exception {
        return null;
    }

    @Override
    public EstudianteCurso registrar(EstudianteCurso datosARegistrar) throws Exception {
        return null;
    }

    @Override
    public EstudianteCurso actualizar(Integer id, EstudianteCurso datosNuevos) throws Exception {
        return null;
    }

    @Override
    public Boolean eliminar(Integer id) throws Exception {
        return null;
    }
}
