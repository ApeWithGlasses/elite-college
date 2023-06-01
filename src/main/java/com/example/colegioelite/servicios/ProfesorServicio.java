package com.example.colegioelite.servicios;

import com.example.colegioelite.entidades.Profesor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServicio implements ServicioBase<Profesor>{
    @Override
    public List<Profesor> buscarTodos() throws Exception {
        return null;
    }

    @Override
    public Profesor buscarPorId(Integer id) throws Exception {
        return null;
    }

    @Override
    public Profesor registrar(Profesor datosARegistrar) throws Exception {
        return null;
    }

    @Override
    public Profesor actualizar(Integer id, Profesor datosNuevos) throws Exception {
        return null;
    }

    @Override
    public Boolean eliminar(Integer id) throws Exception {
        return null;
    }
}
