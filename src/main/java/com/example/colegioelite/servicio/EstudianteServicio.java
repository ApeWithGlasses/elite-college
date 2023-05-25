package com.example.colegioelite.servicio;

import com.example.colegioelite.entidades.Estudiante;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServicio implements ServicioBase<Estudiante>{
    @Override
    public List<Estudiante> buscarTodos() throws Exception {
        return null;
    }

    @Override
    public Estudiante buscarPorId(Integer id) throws Exception {
        return null;
    }

    @Override
    public Estudiante registrar(Estudiante datosARegistrar) throws Exception {
        return null;
    }

    @Override
    public Estudiante actualizar(Integer id, Estudiante datosNuevos) throws Exception {
        return null;
    }

    @Override
    public Boolean eliminar(Integer id) throws Exception {
        return null;
    }
}
