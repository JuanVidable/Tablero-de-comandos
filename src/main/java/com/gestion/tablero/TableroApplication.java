package com.gestion.tablero;

import com.gestion.tablero.domain.entities.CentroDeCosto;
import com.gestion.tablero.domain.entities.GastoCdC;
import com.gestion.tablero.domain.enums.TipoTransaccion;
import com.gestion.tablero.repositories.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TableroApplication {

	public static void main(String[] args) {
		SpringApplication.run(TableroApplication.class, args);
		System.out.println("OK");
	}

	@Autowired
	private CentroDeCostoRepository centroDeCostoRepository;
	@Autowired
	private GastoCdCRepository gastoRepository;
	@Autowired
	private GastoOficinaRepository gastoOficinaRepository;
	@Autowired
	private GastoProyectoRepository gastoProyecto;
	@Autowired
	private OficinaRepository oficinaRepository;
	@Autowired
	private ProyectoRepository proyectoRepository;

	@Bean
	@Transactional
	CommandLineRunner init(CentroDeCostoRepository centroDeCostoRepository,
						   GastoCdCRepository gastoCdCRepository,
						   GastoOficinaRepository gastoOficinaRepository,
						   GastoProyectoRepository gastoProyecto,
						   OficinaRepository oficinaRepository,
						   ProyectoRepository proyectoRepository){

		return args -> {

			System.out.println("OK");
			//Paso 1 crear Centro de costo
			//Paso 2 crear Gasto CdC
			//Paso 3 asociar Gasto con Centro de Costo

			//Repetir con Oficina y Proyecto

			CentroDeCosto centroDeCosto1 = CentroDeCosto.builder().nombre("771").IngresoAcumulado(5000000).EgresoAcumulado(5000000).IngresoMensual(25000).build();
			centroDeCostoRepository.save(centroDeCosto1);

			GastoCdC gastoCdC1 = GastoCdC.builder().fecha("2022-01-01").tipo(TipoTransaccion.INGRESO).monto(50000).descripcion("Ingreso inicial").centroDeCosto(centroDeCosto1).build();
			gastoCdCRepository.save(gastoCdC1);
		};
	}
}
