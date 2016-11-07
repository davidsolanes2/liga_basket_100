package com.example.Controller;

/*
 * Created by dsg on 10/10/16.
 */

import com.example.Domain.Equipo;
import com.example.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.Timed;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
@RequestMapping("/equipos")
public class EquipoController {

    private final EquipoRepository equipoRepository;

    @Autowired
    public EquipoController(EquipoRepository equipoRepository) {
        this.equipoRepository = equipoRepository;
    }

    @RequestMapping(method = POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Equipo save(@RequestBody Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @RequestMapping(method = GET)
    public List<Equipo> findAll() {
        List<Equipo> equipos = new ArrayList<>();

        equipos.addAll(equipoRepository.findAll());
        return equipos;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        Equipo equipo = equipoRepository.findOne(id);
        if (equipo != null) equipoRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Equipo updateById(@PathVariable Long id, @RequestBody Equipo equipo) {
        Equipo e = equipoRepository.findOne(id);
        if (e == equipo) return null;
        return equipoRepository.save(equipo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed(millis = 1000)
    public ResponseEntity<Equipo>getEquipo(@PathVariable Long id) {
        Equipo equipo = equipoRepository.findOne(id);
        return Optional.ofNullable(equipo)
                .map(result-> new ResponseEntity<>(result, HttpStatus.OK))
                .orElse(new ResponseEntity<Equipo>(HttpStatus.NOT_FOUND));
    }
}