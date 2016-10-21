package com.example.Repository;

import com.example.Model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/*
 * Created by dsg on 10/10/16.
 */

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long>{
    Equipo findByNombreEquipo(String nombre);

}
