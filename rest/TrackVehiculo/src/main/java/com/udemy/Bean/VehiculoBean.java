package com.udemy.Bean;

public class VehiculoBean {
	
	private String placa;
	private String recorrido;
	private String sim;
	private String ubicacion;
		
	public VehiculoBean(){
		
		this.placa="SO-102";
		this.recorrido="100KM";
		this.sim="13212314343";
		this.ubicacion="La Victoria";
	}
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getRecorrido() {
		return recorrido;
	}
	public void setRecorrido(String recorrido) {
		this.recorrido = recorrido;
	}
	public String getSim() {
		return sim;
	}
	public void setSim(String sim) {
		this.sim = sim;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	@Override
	public String toString() {
		return "VehiculoBean [placa=" + placa + ", recorrido=" + recorrido + ", sim=" + sim + ", ubicacion=" + ubicacion
				+ "]";
	}
	
}
