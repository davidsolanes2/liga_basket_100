package com.example.Service;

import com.example.Domain.Equipo;
import com.example.Domain.Posicion;
import com.example.Repository.EquipoRepository;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

/*
 * Created by dsg on 10/10/16.
 */
@Transactional
@Service
public class EquipoService {

    private final EquipoRepository equipoRepository;


    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    public EquipoService(EquipoRepository equipoRepository) {
        this.equipoRepository = equipoRepository;
    }

    public void crearEquipo() {

        Equipo equipo1 = new Equipo();
        equipo1.setNombreEquipo("Real Madrid");
        equipo1.setNombreEstadio("Pabellon Barclaycard Center");
        equipo1.setLocalidad("Madrid");
        //equipo1.setFechaCreacion()
        equipoRepository.save(equipo1);

        Equipo equipo2 = new Equipo();
        equipo2.setNombreEquipo("FC Barcelona Lassa");
        equipo2.setNombreEstadio("Palau Blau Grana");
        equipo2.setLocalidad("Barcelona");
        equipoRepository.save(equipo2);

        Equipo equipo3 = new Equipo();
        equipo3.setNombreEquipo("FIATC Juventud");
        equipo3.setNombreEstadio("Palau Olimpic");
        equipo3.setLocalidad("Barcelona");
        equipoRepository.save(equipo3);

        Equipo equipo4 = new Equipo();
        equipo4.setNombreEquipo("Movistar Estudiantes");
        equipo4.setNombreEstadio("Arena Stadium");
        equipo4.setLocalidad("Madrid");
        equipoRepository.save(equipo4);

        Equipo equipo5 = new Equipo();
        equipo5.setNombreEquipo("CAI Zaragoza");
        equipo5.setNombreEstadio("Pabellon Principe Felipe");
        equipo5.setLocalidad("Zaragoza");
        equipoRepository.save(equipo5);

    }

    public void testEquipo(){

        //a. Consulta los equipos existentes en una localidad determinada.

        System.out.println(equipoRepository.findEquipoByLocalidad("Zaragoza"));

        //b. Devuelve todos los jugadores de un equipo, a partir del nombre completo del equipo.

        equipoRepository.findJugadorByNombreEquipo("CAI Zaragoza").forEach(jug -> System.out.println("Equipo/Jugador : " + jug));

        //c. Devuelve todos los jugadores de un equipo, que además jueguen en la misma posición (parámetro adicional de la consulta), por ejemplo, alero.

        equipoRepository.findJugadorByNombreEquipoPosicion("CAI Zaragoza", Posicion.Alero).forEach(jug -> System.out.println("Posicion/Jugador : " + jug));

        //d. Devuelve el jugador que más canastas ha realizado de un equipo determinado como parámetro.

        equipoRepository.findJugadorByNombreEquipomaxNumCanastas("Real Madrid").forEach(jug -> System.out.println("Jugador/Canastas : " + jug)); //revisar

        //System.out.println(equipoRepository.findJugadorByNombreEquipomaxNumCanastas(equipo2));

    }
}
