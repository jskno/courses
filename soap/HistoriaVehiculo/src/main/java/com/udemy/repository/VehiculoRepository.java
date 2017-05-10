package com.udemy.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import io.spring.guides.gs_producing_web_service.Vehiculo;

@Component
public class VehiculoRepository {

	private static final List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	@PostConstruct
	public void initData() {
		Vehiculo v1 = new Vehiculo();
		v1.setPlaca("SO-302");
		v1.setEstado(0);
		v1.setKm("123");
		v1.setUbicacion("1265,6546");

		vehiculos.add(v1);
		
		Vehiculo v2 = new Vehiculo();
		v2.setPlaca("SO-303");
		v2.setEstado(1);
		v2.setKm("150");
		v2.setUbicacion("12145,6646");

		vehiculos.add(v2);

	}

	public Vehiculo findVehiculo(String placa) {
		System.out.println("Entro con la placa = " + placa);
		Vehiculo result = null;

		for (Vehiculo vehiculo : vehiculos) {
			if (placa.equals(vehiculo.getPlaca())) {
				result = vehiculo;
			}
		}

		return result;
	}
	
}
