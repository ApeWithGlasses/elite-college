package com.example.colegioelite.servicios;

import com.example.colegioelite.entidades.Estudiante;
import com.example.colegioelite.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServicio implements ServicioBase<Estudiante>{
    @Autowired
    protected EstudianteRepositorio estudianteRepositorio;
    @Override
    @Transactional(readOnly = true)
    public List<Estudiante> buscarTodos() throws Exception {
        try {
            return estudianteRepositorio.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Estudiante buscarPorId(Integer id) throws Exception {
        try {
            Optional<Estudiante> estudianteOpcional = estudianteRepositorio.findById(id);
            if (estudianteOpcional.isPresent()) {
                return estudianteOpcional.get();
            } else {
                throw new Exception("Usuario no encontrado");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Estudiante registrar(Estudiante datosARegistrar) throws Exception {
        try {
            return estudianteRepositorio.save(datosARegistrar);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
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
