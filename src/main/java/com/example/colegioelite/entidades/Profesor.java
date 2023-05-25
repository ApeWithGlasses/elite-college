package com.example.colegioelite.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "profesores")
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 11)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "escalafon", nullable = false, length = 50)
    private Integer escalafon;

    @OneToMany(mappedBy = "profesor")
    private List<Materia> materias;

    public Profesor() {
    }

    public Profesor(Integer id, String nombre, Integer escalafon, List<Materia> materias) {
        this.id = id;
        this.nombre = nombre;
        this.escalafon = escalafon;
        this.materias = materias;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(Integer escalafon) {
        this.escalafon = escalafon;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}
