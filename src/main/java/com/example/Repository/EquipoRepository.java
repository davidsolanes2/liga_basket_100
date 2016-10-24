package com.example.Repository;

import com.example.Model.Equipo;
import com.example.Model.Jugador;
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


}
