package com.example.colegioelite.servicio;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServicioBase<E> {
    public List<E> buscarTodos() throws Exception;

    public E buscarPorId(Integer id) throws Exception;

    public E registrar(E datosARegistrar) throws Exception;

    public E actualizar(Integer id, E datosNuevos) throws Exception;

    public Boolean eliminar(Integer id) throws Exception;
}
