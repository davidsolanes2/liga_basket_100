package com.example.Repository;

import com.example.Domain.Equipo;
import com.example.Domain.Jugador;
import com.example.Domain.Posicion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * Created by dsg on 10/10/16.
 */

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long>{

    Equipo findByNombreEquipo(String nombre);

    List<Equipo>findEquipoByLocalidad(String localidad);

    @Query("select jug from Jugador jug where jug.equipo.nombreEquipo = :nombre")
    List<Jugador> findJugadorByNombreEquipo(@Param("nombre")String nombre);

    @Query("select jug from Jugador jug where jug.equipo.nombreEquipo = :nombreEquipo and jug.posicion = :posicion")
    List<Jugador> findJugadorByNombreEquipoPosicion(@Param("nombreEquipo") String nombre, @Param("posicion") Posicion posicion);

    @Query("select jug.nombreJugador, jug.numCanastas from Jugador jug where jug.equipo.nombreEquipo = :nombreEquipo and jug.numCanastas = (select max(jug.numCanastas) from Jugador jug where jug.equipo.nombreEquipo= :nombreEquipo)") //revisar
    //select jug.nombre_jugador, jug.num_canastas from Jugador jug where num_canastas = (select max(num_canastas) from Jugador);
    List<Jugador>findJugadorByNombreEquipomaxNumCanastas(@Param("nombreEquipo") String nombre);

}
