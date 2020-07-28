package ec.ups.edu.controlador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.ups.edu.ejb.PacienteFacade;
import ec.ups.edu.ejb.SignosVitalesFacade;
import ec.ups.edu.entidad.Paciente;
import ec.ups.edu.entidad.SignosVitales;
import sun.text.normalizer.UBiDiProps;

@FacesConfig( version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class PacienteBean implements Serializable {

	@EJB
	private PacienteFacade ejbPacienteFacade;
	private String cedula;
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private String direccion ;
	@EJB
	private SignosVitalesFacade ejjbSignos;
	private SignosVitales signosVit;
	
	private Paciente paciente;
	private List<SignosVitales> listSingos;
	
	public PacienteBean() {
		
	}
	

	@PostConstruct
	public void init() {
		
		listSingos= new ArrayList<SignosVitales>();
		
		signosVit= new SignosVitales();
		signosVit.setAlergia("Alergia Polvo");
		signosVit.setCodigo(1);
		signosVit.setDescripcion("Matutina");
		signosVit.setEnefermedades("Asma");
		signosVit.setPaciente(paciente);
		signosVit.setSintoma("Dolor estomacal");
		listSingos.add(signosVit);
		
		
		ejbPacienteFacade.create(new Paciente("0302127022", "Edwin", "Marquez", "26/08/1999", "Azogues","edwin199@gmail.com") );
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
