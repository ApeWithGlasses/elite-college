package com.example.colegioelite.controladores;

import com.example.colegioelite.entidades.Estudiante;
import com.example.colegioelite.servicios.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/estudiantes")
public class EstudianteControlador {
    @Autowired
    protected EstudianteServicio estudianteServicio;

    @GetMapping
    public ResponseEntity<List<Estudiante>> buscarTodos() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(estudianteServicio.buscarTodos());
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(null);
        }
    }

    @PostMapping("/registrar")
    public ResponseEntity<Estudiante> registrar(@RequestBody Estudiante datosARegistrar) {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(estudianteServicio.registrar(datosARegistrar));
        } catch (Exception e) {
            String mensajeDeError = "Hubo un error al registrar " + e.getMessage();
            Estudiante errorEstudiante = new Estudiante();
            errorEstudiante.setMensajeError(mensajeDeError);
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errorEstudiante);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> buscarEstudiante(@PathVariable(name = "id") Integer id) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(estudianteServicio.buscarPorId(id));
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(null);
        }
    }
}
