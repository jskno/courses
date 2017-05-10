package udemy.demo;

public class IdentificacionBean {

	private String usuario;
	private String codigo;
	private DatosBean datosBean;
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public DatosBean getDatosBean() {
		return datosBean;
	}
	public void setDatosBean(DatosBean datosBean) {
		this.datosBean = datosBean;
	}
	@Override
	public String toString() {
		return "IdentificacionBean [usuario=" + usuario + ", codigo=" + codigo + ", datosBean=" + datosBean + "]";
	}
	
	
	
	
}
