package com.example.Service;

import com.example.Model.Equipo;
import com.example.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
 * Created by dsg on 10/10/16.
 */
@Service
@Transactional
public class EquipoService {
    private final EquipoRepository equipoRepository;

    @Autowired
    public EquipoService(EquipoRepository equipoRepository) {
        this.equipoRepository = equipoRepository;
    }

    public EquipoService testEquipo(){
        Equipo equipo1 = new Equipo();
        equipo1.setNombreEquipo("Real Madrid");
        equipo1.setNombreEstadio("Pabellon Barclaycard Center");
        equipo1.setLocalidad("Madrid");
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
        equipo4.setNombreEquipo("Moviestar Estudiantes");
        equipo4.setNombreEstadio("Arena Stadium");
        equipo4.setLocalidad("Madrid");
        equipoRepository.save(equipo4);

        Equipo equipo5 = new Equipo();
        equipo5.setNombreEquipo("CAI Zaragoza");
        equipo5.setNombreEstadio("Pabellon Principe Felipe");
        equipo5.setLocalidad("Zaragoza");
        equipoRepository.save(equipo5);


        /* ---------------------------------------------------------------------------------------------------------------------*/


        //a. Consulta los equipos existentes en una localidad determinada.
        //b. Devuelve todos los jugadores de un equipo, a partir del nombre completo del equipo.
        //c. Devuelve todos los jugadores de un equipo, que además jueguen en la misma posición (parámetro adicional de la consulta), por ejemplo, alero.
        //d. Devuelve el jugador que más canastas ha realizado de un equipo determinado como parámetro.



        return null;
    }
}
