package com.example.Controller;

/*
 * Created by dsg on 10/10/16.
 */

import com.example.Domain.Jugador;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.Timed;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.OPTIONS;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/jugadors")

public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador save(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    @GetMapping
    public List<Jugador> getAllJugador() {
        List<Jugador> jugadors = new ArrayList<>();
        Iterator<Jugador> iterator = jugadorRepository.findAll().iterator();
        while (iterator.hasNext()) {
         jugadors.add(iterator.next());
        }
        return jugadors;
    }

    @DeleteMapping("/{id")
    public void deletePlayerId(@PathVariable Long id) {
        Jugador jugador = jugadorRepository.findOne(id);
        if (jugador != null)jugadorRepository.delete(id);
    }

    @PutMapping
    public Jugador updateJugador(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jugador> getJugadorID(@PathVariable Long id) {
        Jugador jugador = jugadorRepository.findOne(id);
        return Optional.ofNullable(jugador)
                .map(result -> new ResponseEntity<>(result, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/byNumCanastas/")
    public List<Jugador> findByNumCanastasGreaterThanEqual(@PathVariable Integer numCanastas) {
        return jugadorRepository.findByNumCanastasGreaterThanEqual(numCanastas);
    }

    /*@RequestMapping(value = "/{id}" , method = RequestMethod.PUT)
    public Jugador updateJugadorId(@PathVariable Long id, @RequestBody Jugador jugador) {
        Jugador j = jugadorRepository.findOne(id);
        if (j == jugador) return null;
        return jugadorRepository.save(jugador);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed(millis = 1000)
    public ResponseEntity<Jugador>getJugador(@PathVariable Long id){
        Jugador jugador = jugadorRepository.findOne(id);
        return Optional.ofNullable(jugador)
                .map(result -> new ResponseEntity<>(result, HttpStatus.OK))
                .orElse(new ResponseEntity<Jugador>(HttpStatus.NOT_FOUND));
    }*/


}
