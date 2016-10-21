package com.example.Service;

import com.example.Model.Jugador;
import com.example.Model.Posicion;
import com.example.Repository.EquipoRepository;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

import static jdk.nashorn.internal.objects.NativeArray.forEach;


/*
 * Created by dsg on 10/10/16.
 */

@Service
@Transactional
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    public JugadorService testJugador() {

        Jugador jugador1 = new Jugador();
        jugador1.setNombreJugador("Justin");
        jugador1.setFechaNacimiento(LocalDate.of(1995, 7, 25));
        jugador1.setNumCanastas(20);
        jugador1.setNumAsistencias(35);
        jugador1.setNumRebotes(5);
        jugador1.setPosicion(Posicion.Base);
        jugador1.setEquipo(equipoRepository.findByNombreEquipo("FC Barcelona Lassa"));
        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador();
        jugador2.setNombreJugador("Pau");
        jugador2.setFechaNacimiento(LocalDate.of(1994,7,31));
        jugador2.setNumAsistencias(25);
        jugador2.setNumCanastas(35);
        jugador2.setNumRebotes(15);
        jugador2.setPosicion(Posicion.Alero);
        jugador2.setEquipo(equipoRepository.findByNombreEquipo("FC Barcelona Lassa"));
        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador();
        jugador3.setNombreJugador("Shane");
        jugador3.setFechaNacimiento(LocalDate.of(1994,3,9));
        jugador3.setNumAsistencias(27);
        jugador3.setNumCanastas(32);
        jugador3.setNumRebotes(18);
        jugador3.setPosicion(Posicion.Escolta);
        jugador3.setEquipo(equipoRepository.findByNombreEquipo("FC Barcelona Lassa"));
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador();
        jugador4.setNombreJugador("Demond");
        jugador4.setFechaNacimiento(LocalDate.of(1993,7,19));
        jugador4.setNumAsistencias(29);
        jugador4.setNumCanastas(38);
        jugador4.setNumRebotes(20);
        jugador4.setPosicion(Posicion.Base);
        jugador4.setEquipo(equipoRepository.findByNombreEquipo("FIATC Juventud"));
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador();
        jugador5.setNombreJugador("Albert");
        jugador5.setFechaNacimiento(LocalDate.of(1993,7,19));
        jugador5.setNumAsistencias(39);
        jugador5.setNumCanastas(40);
        jugador5.setNumRebotes(28);
        jugador5.setPosicion(Posicion.Base);
        jugador5.setEquipo(equipoRepository.findByNombreEquipo("FIATC Juventud"));
        jugadorRepository.save(jugador5);

        Jugador jugador6 = new Jugador();
        jugador6.setNombreJugador("Sergi");
        jugador6.setFechaNacimiento(LocalDate.of(1993,7,19));
        jugador6.setNumAsistencias(39);
        jugador6.setNumCanastas(40);
        jugador6.setNumRebotes(28);
        jugador6.setPosicion(Posicion.Escolta);
        jugador6.setEquipo(equipoRepository.findByNombreEquipo("FIATC Juventud"));
        jugadorRepository.save(jugador5);

        Jugador jugador7 = new Jugador();
        jugador7.setNombreJugador("Rudy");
        jugador7.setFechaNacimiento(LocalDate.of(1993,7,19));
        jugador7.setNumAsistencias(39);
        jugador7.setNumCanastas(40);
        jugador7.setNumRebotes(28);
        jugador7.setPosicion(Posicion.Ala);
        jugador7.setEquipo(equipoRepository.findByNombreEquipo("Real Madrid"));
        jugadorRepository.save(jugador7);

        Jugador jugador8 = new Jugador();
        jugador8.setNombreJugador("Andres");
        jugador8.setFechaNacimiento(LocalDate.of(1993,7,19));
        jugador8.setNumAsistencias(39);
        jugador8.setNumCanastas(40);
        jugador8.setNumRebotes(28);
        jugador8.setPosicion(Posicion.Escolta);
        jugador8.setEquipo(equipoRepository.findByNombreEquipo("Real Madrid"));
        jugadorRepository.save(jugador8);

        Jugador jugador9 = new Jugador();
        jugador9.setNombreJugador("Jonas");
        jugador9.setFechaNacimiento(LocalDate.of(1993,7,19));
        jugador9.setNumAsistencias(39);
        jugador9.setNumCanastas(40);
        jugador9.setNumRebotes(28);
        jugador9.setPosicion(Posicion.Ala);
        jugador9.setEquipo(equipoRepository.findByNombreEquipo("Real Madrid"));
        jugadorRepository.save(jugador9);

        Jugador jugador10 = new Jugador();
        jugador10.setNombreJugador("Daniel_06");
        jugador10.setFechaNacimiento(LocalDate.of(1993,7,19));
        jugador10.setNumAsistencias(39);
        jugador10.setNumCanastas(40);
        jugador10.setNumRebotes(28);
        jugador10.setPosicion(Posicion.Ala);
        jugador10.setEquipo(equipoRepository.findByNombreEquipo("CAI Zaragoza"));
        jugadorRepository.save(jugador10);

        Jugador jugador11 = new Jugador();
        jugador11.setNombreJugador("Daniel_05");
        jugador11.setFechaNacimiento(LocalDate.of(1993,7,19));
        jugador11.setNumAsistencias(39);
        jugador11.setNumCanastas(40);
        jugador11.setNumRebotes(28);
        jugador11.setPosicion(Posicion.Ala);
        jugador11.setEquipo(equipoRepository.findByNombreEquipo("CAI Zaragoza"));
        jugadorRepository.save(jugador11);

        Jugador jugador12 = new Jugador();
        jugador12.setNombreJugador("Daniel_01");
        jugador12.setFechaNacimiento(LocalDate.of(1993,7,19));
        jugador12.setNumAsistencias(39);
        jugador12.setNumCanastas(40);
        jugador12.setNumRebotes(28);
        jugador12.setPosicion(Posicion.Ala);
        jugador12.setEquipo(equipoRepository.findByNombreEquipo("CAI Zaragoza"));
        jugadorRepository.save(jugador12);

        Jugador jugador13 = new Jugador();
        jugador13.setNombreJugador("Daniel_02");
        jugador13.setFechaNacimiento(LocalDate.of(1993,7,19));
        jugador13.setNumAsistencias(39);
        jugador13.setNumCanastas(40);
        jugador13.setNumRebotes(28);
        jugador13.setPosicion(Posicion.Ala);
        jugador13.setEquipo(equipoRepository.findByNombreEquipo("Movistar Estudiantes"));
        jugadorRepository.save(jugador13);

        Jugador jugador14 = new Jugador();
        jugador14.setNombreJugador("Daniel_03");
        jugador14.setFechaNacimiento(LocalDate.of(1993,7,19));
        jugador14.setNumAsistencias(39);
        jugador14.setNumCanastas(40);
        jugador14.setNumRebotes(28);
        jugador14.setPosicion(Posicion.Ala);
        jugador14.setEquipo(equipoRepository.findByNombreEquipo("Movistar Estudiantes"));
        jugadorRepository.save(jugador14);

        Jugador jugador15 = new Jugador();
        jugador15.setNombreJugador("Daniel_04");
        jugador15.setFechaNacimiento(LocalDate.of(1993,7,19));
        jugador15.setNumAsistencias(39);
        jugador15.setNumCanastas(40);
        jugador15.setNumRebotes(28);
        jugador15.setPosicion(Posicion.Ala);
        jugador15.setEquipo(equipoRepository.findByNombreEquipo("Movistar Estudiantes"));
        jugadorRepository.save(jugador15);

        /* --------------------------------------------------------------------------------------------------------- */

        //a. buscar jugadores por el nombre, de manera que no sea necesario introducir el nombre completo

        System.out.println(jugadorRepository.findByNombreJugadorContaining("Jo"));

        //b. buscar jugadores que hayan conseguido un numero mayor o igual a un numero de canastas especificado como parametro

        System.out.println(jugadorRepository.findByNumCanastasGreaterThanEqual(5));

        //c. buscar jugadores que hayan efectuado un numero de asistencias dentro de un rango especificado como parametro

        System.out.println(jugadorRepository.findByNumAsistenciasBetween(5,10));

        //d. buscar jugadores que pertenezcan a una posicion especifica, por ejemplo base

        System.out.println(jugadorRepository.findByPosicionIs(Posicion.Base));

        //e. buscar jugadores que hayan nacido en una fecha anterior a una fecha especificado como parametro

        System.out.println(jugadorRepository.findByFechaNacimientoBefore(LocalDate.of(1985, 6, 15)));

        /*f. Agrupar los jugadores por la posicion del campo y devolver para cada grupo la siguiente informacion: la media de canastas,
                  la media de asistencias y rebotes */

        List<Object[]> lista_01 = jugadorRepository.findByMedia();

        for (Object[] aux: lista_01) {
            System.out.println("Posicion " + aux[3] + " Media de Canastas : " + aux[0] + " Media de Aistencias : " + aux[1] + " Media de Rebotes : " + aux[2]);
        }

        /*g. Lo mismo que el punto anterior pero devolviendo la media, el maximo y el minimo de canastas, asistencias y rebotes */

        List<Object[]> lista_02 = jugadorRepository.findByConsulta();

        for (Object[] aux_01:lista_02) {
            System.out.println("Media Canastas : " + aux_01[0] + " Maximo : " + aux_01[1] + " Minimo : " + aux_01[2] + " , Media Asistencias : " + aux_01[3] + " Maximo : " + aux_01[4] + " Minimo : " + aux_01[5] + " , Media Rebotes : " + aux_01[6] + " Maximo : " + aux_01[7] + " Minimo : " + aux_01[8]);
        }
        return null;
    }
}


