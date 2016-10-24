package com.example;

import com.example.Repository.EquipoRepository;
import com.example.Repository.JugadorRepository;
import com.example.Service.EquipoService;
import com.example.Service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class LigaBasket100Application {


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LigaBasket100Application.class, args);

		EquipoService equipoService = context.getBean(EquipoService.class);
		JugadorService jugadorService = context.getBean(JugadorService.class);


		equipoService.crearEquipo();

		jugadorService.crearJugador();

		equipoService.testEquipo();

		jugadorService.testJugador();


	}

}
