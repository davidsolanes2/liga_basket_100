package com.example.Model;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;

/*
 * Created by dsg on 10/10/16.
 */

@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    protected Long id;
    @Column
    protected String nombreJugador;
    @Column
    protected LocalDate fechaNacimiento;
    @Column
    protected int numCanastas;
    @Column
    protected int numAsistencias;
    @Column
    protected int numRebotes;

    @JsonIgnore
    @ManyToOne
    private Equipo equipo;

    @Enumerated
    private Posicion posicion;

    public Jugador(){}

    public Jugador(String nombreJugador, LocalDate fechaNacimiento, int numCanastas, int numAsistencias, int numRebotes, Equipo equipo, Posicion posicion) {
        this.nombreJugador = nombreJugador;
        this.fechaNacimiento = fechaNacimiento;
        this.numCanastas = numCanastas;
        this.numAsistencias = numAsistencias;
        this.numRebotes = numRebotes;
        this.equipo = equipo;
        this.posicion = posicion;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumCanastas() {
        return numCanastas;
    }

    public void setNumCanastas(int numCanastas) {
        this.numCanastas = numCanastas;
    }

    public int getNumAsistencias() {
        return numAsistencias;
    }

    public void setNumAsistencias(int numAsistencias) {
        this.numAsistencias = numAsistencias;
    }

    public int getNumRebotes() {
        return numRebotes;
    }

    public void setNumRebotes(int numRebotes) {
        this.numRebotes = numRebotes;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombreJugador='" + nombreJugador + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", numCanastas=" + numCanastas +
                ", numAsistencias=" + numAsistencias +
                ", numRebotes=" + numRebotes +
                ", equipo=" + equipo +
                ", posicion=" + posicion +
                '}';
    }
}
