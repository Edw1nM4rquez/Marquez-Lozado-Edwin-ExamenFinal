package ec.ups.edu.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity

public class Paciente implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id 
	private String cedula;
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private String direccion ;
	private String correoElectronico;

	@OneToMany(cascade = CascadeType.ALL, mappedBy ="paciente")
	private List<SignosVitales> signosV;
	
	
	
	public Paciente() {
		super();
	}

 //Ingresar pacinetes con sintomas 

	public Paciente(String cedula, String nombre, String apellido, String fechaNacimiento, String direccion,String correoElec,
			List<SignosVitales> signosV) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		//this.signosV = signosV;
		this.correoElectronico= correoElec;
	}

	//Para registrar pacientes 
	public Paciente(String cedula, String nombre, String apellido, String fechaNacimiento, String direccion,String correoElec) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.correoElectronico= correoElec;
	}


	public String getCedula() {
		return cedula;
	}



	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
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



public List<SignosVitales> getSignosV() {
		return signosV;
	}



	public void setSignosV(List<SignosVitales> signosV) {
		this.signosV = signosV;
	}

	
	
	
}
