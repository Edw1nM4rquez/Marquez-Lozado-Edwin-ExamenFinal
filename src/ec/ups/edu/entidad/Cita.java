package ec.ups.edu.entidad;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cita
 *
 */
@Entity

public class Cita implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	private String numeroCita;
	private String fecha;
	private String hora;
	
	@OneToOne
	@JoinColumn
	private Paciente paciente;
	

	
	
	
	public Cita() {
		
	}





	public Cita(String numeroCita, String fecha, String hora, Paciente paciente) {
		super();
		this.numeroCita = numeroCita;
		this.fecha = fecha;
		this.hora = hora;
		this.paciente = paciente;
	}





	public String getNumeroCita() {
		return numeroCita;
	}





	public void setNumeroCita(String numeroCita) {
		this.numeroCita = numeroCita;
	}





	public String getFecha() {
		return fecha;
	}





	public void setFecha(String fecha) {
		this.fecha = fecha;
	}





	public String getHora() {
		return hora;
	}





	public void setHora(String hora) {
		this.hora = hora;
	}





	public Paciente getPaciente() {
		return paciente;
	}





	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
   
	
	
}
