package com.example.colegioelite.controladores;

import com.example.colegioelite.dto.EstudianteDTO;
import com.example.colegioelite.servicios.EstudianteServicioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/estudiantesDTO")
public class EstudianteControladorDTO {
    @Autowired
    protected EstudianteServicioDTO estudianteServicioDTO;

    @GetMapping
    public ResponseEntity<List<EstudianteDTO>> obtenerTodos() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(estudianteServicioDTO.buscarTodos());
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(null);
        }
    }
}
