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
@Table(name = "alumno")
public class Alumno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_alumno")
    private long id_alumno;

    private String rut;

    private String nombre;

    private String correo;

    private int año_ingreso;

    @ManyToMany
    @JoinTable(
            name = "alumno_facultad",
            joinColumns = {
                @JoinColumn(name = "alumno_id", referencedColumnName = "id_alumno")},
            inverseJoinColumns = {
                @JoinColumn(name = "facultad_id", referencedColumnName = "id_facultad")}
    )
    private Set<Facultad> facultades;

    public long getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(long id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getAño_ingreso() {
        return año_ingreso;
    }

    public void setAño_ingreso(int año_ingreso) {
        this.año_ingreso = año_ingreso;
    }

    public Set<Facultad> getFacultades() {
        return facultades;
    }

    public void setFacultades(Set<Facultad> facultades) {
        this.facultades = facultades;
    }

}
