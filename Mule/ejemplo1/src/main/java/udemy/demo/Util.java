package udemy.demo;

public class Util {
	
	public VehiculoBean demo(String modelo, int anio) {
		VehiculoBean vehiculoBean = new VehiculoBean();
		vehiculoBean.setModelo(modelo);
		vehiculoBean.setAnio(anio + 1);
		return vehiculoBean;	
	}
	
	public String getError(int estado) {
		if(estado == 1) {
			throw new ArithmeticException("Error 1");
		} else if(estado == 2)  {
			throw new NullPointerException("Error 2");
		}
		return "";
	}
	
	public void beforeSoap() {
		System.out.print("We're going to consume Soap service");
	}
	
	public IdentificacionBean obtenerDatos() {
		IdentificacionBean identificacionBean = new IdentificacionBean();
		DatosBean datosBean = new DatosBean();
		datosBean.setPlaca("SO-302");
		datosBean.setSim("14214214");
		identificacionBean.setDatosBean(datosBean);
		identificacionBean.setCodigo("abc123");
		identificacionBean.setUsuario("Irving");
		return identificacionBean;
	}

}
