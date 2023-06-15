package com.example.colegioelite.controladores;

import com.example.colegioelite.entidades.Estudiante;
import com.example.colegioelite.servicios.EstudianteServicio;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/estudiantes")
@Tag(name = "Servicio estudiantes", description = "Servicios que ofrecen CRUD en la entidad estudiantes.")
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
    @Operation(summary = "Registra un estudiante en la base de datos")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Estudiante creado."),
            @ApiResponse(responseCode = "400", description = "Fallo en el registro, revise su peticion.")
    })
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
