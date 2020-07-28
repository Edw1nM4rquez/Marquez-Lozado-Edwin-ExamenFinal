package ec.ups.edu.controlador;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.ups.edu.ejb.SignosVitalesFacade;

@FacesConfig( version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class SignoVitalBean implements Serializable{

	@EJB
	private SignosVitalesFacade ejbSignosvi;
	private int codigo;
	private String descripcion;
	
	private String sintoma;
	private String alergia;
	private String enefermedades;
	
	
	
	public SignoVitalBean() {
		
	}
	
	
	
	public SignosVitalesFacade getEjbSignosvi() {
		return ejbSignosvi;
	}
	public void setEjbSignosvi(SignosVitalesFacade ejbSignosvi) {
		this.ejbSignosvi = ejbSignosvi;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	public String getAlergia() {
		return alergia;
	}
	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}
	public String getEnefermedades() {
		return enefermedades;
	}
	public void setEnefermedades(String enefermedades) {
		this.enefermedades = enefermedades;
	}
	
	
}
