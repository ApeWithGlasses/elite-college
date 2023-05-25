package com.example.colegioelite.servicio;

import com.example.colegioelite.entidades.Materia;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaServicio implements ServicioBase<Materia>{
    @Override
    public List<Materia> buscarTodos() throws Exception {
        return null;
    }

    @Override
    public Materia buscarPorId(Integer id) throws Exception {
        return null;
    }

    @Override
    public Materia registrar(Materia datosARegistrar) throws Exception {
        return null;
    }

    @Override
    public Materia actualizar(Integer id, Materia datosNuevos) throws Exception {
        return null;
    }

    @Override
    public Boolean eliminar(Integer id) throws Exception {
        return null;
    }
}
