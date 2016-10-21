package com.example.Controllers;

/*
 * Created by dsg on 10/10/16.
 */

import com.example.Model.Jugador;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/jugadors")

public class JugadorControllers {

    @Autowired
    private JugadorRepository jugadorRepository;

    @RequestMapping(method = POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador save(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    @RequestMapping(method = GET)
    public List<Jugador>findAll() {
        List<Jugador> jugadors = new ArrayList<>();
        Iterator<Jugador> Iterator = jugadorRepository.findAll().iterator();

        while (Iterator.hasNext()) {
            jugadors.add(Iterator.next());
        }
        return jugadors;
    }
}
