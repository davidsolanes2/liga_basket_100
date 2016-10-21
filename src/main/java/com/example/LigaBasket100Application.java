package com.example;

import com.example.Repository.JugadorRepository;
import com.example.Service.EquipoService;
import com.example.Service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LigaBasket100Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LigaBasket100Application.class, args);

		JugadorService jugadorService = context.getBean(JugadorService.class);
		EquipoService equipoService = context.getBean(EquipoService.class);

		equipoService.testEquipo();
		jugadorService.testJugador();
	}
}
