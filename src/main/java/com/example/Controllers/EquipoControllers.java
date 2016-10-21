package com.example.Controllers;

/*
 * Created by dsg on 10/10/16.
 */

import com.example.Model.Equipo;
import com.example.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/equipos")
public class EquipoControllers {

    @Autowired
    private EquipoRepository equipoRepository;

    @RequestMapping(method = POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Equipo save(@RequestBody Equipo equipo) {
        return equipoRepository.save(equipo);
    }


    @RequestMapping(method = GET)
    public List<Equipo> findAll() {
        List<Equipo> equipos = new ArrayList<Equipo>();
        Iterator<Equipo> iterator = equipoRepository.findAll().iterator();

        while (iterator.hasNext()) {
            equipos.add(iterator.next());
        }
        return equipos;
    }
}