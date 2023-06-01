package com.example.colegioelite.servicios;

import com.example.colegioelite.entidades.Acudiente;
import com.example.colegioelite.repositorio.AcudienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AcudienteServicio  implements ServicioBase<Acudiente>{
    @Autowired
    protected AcudienteRepositorio acudienteRepositorio;

    @Override
    @Transactional(readOnly = true)
    public List<Acudiente> buscarTodos() throws Exception {
        try {
            return acudienteRepositorio.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Acudiente buscarPorId(Integer id) throws Exception {
        try {
            Optional<Acudiente> acudienteOpcional = acudienteRepositorio.findById(id);
            if (acudienteOpcional.isPresent()) {
                return acudienteOpcional.get();
            } else {
                throw new Exception("Usuario no encontrado");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Acudiente registrar(Acudiente datosARegistrar) throws Exception {
        try {
            return acudienteRepositorio.save(datosARegistrar);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Acudiente actualizar(Integer id, Acudiente datosNuevos) throws Exception {
        try {
            Optional<Acudiente> acudienteOpcional = acudienteRepositorio.findById(id);
            if (acudienteOpcional.isPresent()) {
                Acudiente acudienteExistente = acudienteOpcional.get();
                acudienteExistente.setNombre(datosNuevos.getNombre());
                acudienteExistente.setTelefono(datosNuevos.getTelefono());
                return acudienteRepositorio.save(acudienteExistente);
            } else {
                throw new Exception("Usuario no encontrado");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Boolean eliminar(Integer id) throws Exception {
        try {
            Optional<Acudiente> acudienteOpcional = acudienteRepositorio.findById(id);
            if (acudienteOpcional.isPresent()) {
                acudienteRepositorio.deleteById(id);
                return true;
            } else {
                throw new Exception("Usuario no encontrado");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
