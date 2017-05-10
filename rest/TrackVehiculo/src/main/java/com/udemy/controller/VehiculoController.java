package com.udemy.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.Bean.IdentificacionBean;
import com.udemy.Bean.VehiculoBean;

@RestController
@RequestMapping(value="/vehiculo")
public class VehiculoController {

	@PostMapping(value="/getDatos", produces = "application/json; charset=UTF-8")
	public VehiculoBean getDatos(@RequestBody IdentificacionBean identificacionBean){
		
		System.out.println(identificacionBean.toString());
		System.out.println(identificacionBean.getDatosBean().toString());
		
		VehiculoBean bean = new VehiculoBean();
		
		return bean;
	}
	
}
