package com.example.Controller;

/*
 * Created by dsg on 10/10/16.
 */

import com.example.Model.Equipo;
import com.example.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
}