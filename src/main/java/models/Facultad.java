/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author benjamin
 */
@Entity
@Table(name = "facultad")
public class Facultad implements Serializable {

    public Facultad() {
    }

    public Facultad(Long id_facultad, String nombre, Set<Alumno> alumnos) {
        this.id_facultad = id_facultad;
        this.nombre = nombre;
        this.alumnos = alumnos;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_facultad")
    private Long id_facultad;

    private String nombre;

    @ManyToMany(mappedBy = "facultades")
    private Set<Alumno> alumnos;

    public Long getId_facultad() {
        return id_facultad;
    }

    public void setId_facultad(Long id_facultad) {
        this.id_facultad = id_facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

}
