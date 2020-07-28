package ec.ups.edu.controlador;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import ec.ups.edu.ejb.PacienteFacade;
import ec.ups.edu.entidad.Paciente;
import sun.text.normalizer.UBiDiProps;

public class PacienteBean implements Serializable {

	@EJB
	private PacienteFacade ejbPacienteFacade;
	private String cedula;
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private String direccion ;
	
	public PacienteBean() {
		
	}
	

	@PostConstruct
	public void init() {
		
		
		ejbPacienteFacade.create(new Paciente("0302127022", "Edwin", "Marquez", "26/08/1999", "Azogues") );
	}


	public PacienteFacade getEjbPacienteFacade() {
		return ejbPacienteFacade;
	}


	public void setEjbPacienteFacade(PacienteFacade ejbPacienteFacade) {
		this.ejbPacienteFacade = ejbPacienteFacade;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
