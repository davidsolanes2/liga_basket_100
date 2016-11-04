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

    /*@Query("select jug.nombreJugador, jug.numCanastas, eq.localidad from Jugador jug, Equipo eq where jug.equipo_id = eq.id and jug.numCanastas in (select max(jug.numCanastas) from Jugador jug, Equipo eq where eq.localidad= :nombre)")
    /*select jug.nombre_jugador, jug.num_canastas, eq.localidad from Jugador jug, Equipo eq where
    jug.equipo_id=eq.id and num_canastas in (select max(jug.num_canastas) from jugador jug, equipo eq and eq.localidad = 'Barcelona';*/
    //List<Jugador>findJugadorByNombreEquipomaxNumCanastas(@Param("nombre") String nombre);


}
