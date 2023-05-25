package com.example.colegioelite.repositorio;

import com.example.colegioelite.entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Integer> {
}
