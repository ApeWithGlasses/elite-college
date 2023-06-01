package com.example.colegioelite.controladores;

import com.example.colegioelite.entidades.Acudiente;
import com.example.colegioelite.servicios.AcudienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/acudientes")
public class AcudienteControlador {
    @Autowired
    protected AcudienteServicio acudienteServicio;

    @GetMapping
    public ResponseEntity<List<Acudiente>> buscarTodos() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(acudienteServicio.buscarTodos());
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(null);
        }
    }

    @PostMapping("/registrar")
    public ResponseEntity<Acudiente> registrar(@RequestBody Acudiente datosAGuardar) {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(acudienteServicio.registrar(datosAGuardar));
        } catch (Exception e) {
            String mensajeDeError = "Hubo un error al registrar " + e.getMessage();
            Acudiente errorAcudiente = new Acudiente();
            errorAcudiente.setMensajeError(mensajeDeError);
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errorAcudiente);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Acudiente> buscarAcudiente(@PathVariable(name = "id") Integer id) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(acudienteServicio.buscarPorId(id));
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(null);
        }
    }
}
