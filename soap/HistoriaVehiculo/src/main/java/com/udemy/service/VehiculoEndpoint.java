package com.udemy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.udemy.repository.VehiculoRepository;

import io.spring.guides.gs_producing_web_service.GetVehiculoRequest;
import io.spring.guides.gs_producing_web_service.GetVehiculoResponse;

@Endpoint
public class VehiculoEndpoint {

	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private VehiculoRepository vehiculoRepository;

	@Autowired
	public VehiculoEndpoint(VehiculoRepository vehiculoRepository) {
		this.vehiculoRepository = vehiculoRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getVehiculoRequest")
	@ResponsePayload
	public GetVehiculoResponse getVehiculoRequest(@RequestPayload GetVehiculoRequest request) {
		GetVehiculoResponse response = new GetVehiculoResponse();
		response.setVehiculo(vehiculoRepository.findVehiculo(request.getPlaca()));
		return response;
	}
	
	
}
