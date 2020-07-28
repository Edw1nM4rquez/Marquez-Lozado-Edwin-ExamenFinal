package ec.ups.edu.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SignoVital
 *
 */
@Entity

public class SignosVitales implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int codigo;
	private String descripcion;
	
	private String sintoma;
	private String alergia;
	private String enefermedades;
	
	@ManyToOne
	@JoinColumn
	private Paciente paciente;
	
	public SignosVitales() {
	
	}
	
	

	public SignosVitales(int codigo, String descripcion, String sintoma, String alergia, String enefermedades,
			Paciente paciente) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.sintoma = sintoma;
		this.alergia = alergia;
		this.enefermedades = enefermedades;
		this.paciente = paciente;
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

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
   
	
	
}
