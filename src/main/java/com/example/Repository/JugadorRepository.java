package com.example.Repository;

/*
 * Created by dsg on 10/10/16.
 */


import com.example.Model.Jugador;
import com.example.Model.Posicion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    List<Jugador>findByNombreJugadorContaining(String nombreJugador);
    List<Jugador>findByNumCanastasGreaterThanEqual(int numCanastas);
    List<Jugador>findByNumAsistenciasBetween(int minnumAsistencias, int maxnumAsistencias);
    List<Jugador>findByPosicionIs(Posicion posicion);
    List<Jugador>findByFechaNacimientoBefore(LocalDate fechaNacimiento);

    List<Jugador> findByEquipoNombreEquipo(String nombre);

    @Query("select avg(jug.numCanastas), avg(jug.numAsistencias), avg(jug.numRebotes), jug.posicion from Jugador jug group by jug.posicion")
    List<Object[]>findByMedia();

    @Query("select avg(jug.numCanastas), max(jug.numCanastas), min(jug.numCanastas), avg(jug.numAsistencias), max(jug.numAsistencias), min(jug.numAsistencias), avg(jug.numRebotes), max(jug.numRebotes), min(jug.numRebotes) from Jugador jug")
    List<Object[]>findByConsulta();
}
