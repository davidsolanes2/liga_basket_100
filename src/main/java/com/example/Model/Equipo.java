package com.example.Model;

import com.sun.istack.internal.NotNull;
import net.minidev.json.annotate.JsonIgnore;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 * Created by dsg on 10/10/16.
 */
@Entity
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "nombre_equipo", nullable = false)
    private String nombreEquipo;

    @Column
    protected String nombreEstadio;

    @Column
    protected String localidad;

    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;

    /*
    @OneToMany(mappedBy = "equipo")
    private Set<Jugador> jugador = new HashSet<>();*/

    //@JsonIgnore
    //@ManyToMany(mappedBy = "equipos")
    //private Set<Temporada> temporadas = new HashSet<>();

    public Equipo(){}

    public Equipo(String nombreEquipo, String nombreEstadio, String localidad, LocalDate fechaCreacion) {
        this.nombreEquipo = nombreEquipo;
        this.nombreEstadio = nombreEstadio;
        this.localidad = localidad;
        this.fechaCreacion = fechaCreacion;
    }

    public Long getId() { return id;}

    public void setId(Long id) { this.id = id; }

    public String getNombreEquipo() { return  nombreEquipo; }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /*public Set<Jugador>getJugador() { return jugador; }

    public void setJugador(Set<Jugador> jugador) { this.jugador = jugador; }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Equipo equipo = (Equipo) o;
        if (equipo.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, equipo.id);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombreEquipo='" + nombreEquipo + '\'' +
                ", nombreEstadio='" + nombreEstadio + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
