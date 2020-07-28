package ec.ups.edu.controlador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.ups.edu.ejb.CitaFacade;
import ec.ups.edu.ejb.SignosVitalesFacade;
import ec.ups.edu.entidad.Cita;
import ec.ups.edu.entidad.Paciente;
import ec.ups.edu.entidad.SignosVitales;


@FacesConfig( version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class CitaBean implements Serializable {

	@EJB
	private CitaFacade ejbCitafacade;

	private String numeroCita;
	private String fecha;
	private String hora;
	
	private Paciente paciente;
	private SignosVitales signosVit;

	private List<SignosVitales> listSingos;
	
	 public CitaBean() {
		
	}
	
	@PostConstruct
	public void init() {
		
		
listSingos= new ArrayList<SignosVitales>();
		
		
		
		paciente= new Paciente();
		paciente.setApellido("Marquez");
		paciente.setNombre("Edwin");
		paciente.setCorreoElectronico("edwin199@gmail.com");
		paciente.setDireccion("Azogues");
		paciente.setFechaNacimiento("26/08/1999");
	//	paciente.setSignosV(listSingos);
		
		signosVit= new SignosVitales();
		signosVit.setAlergia("Alergia Polvo");
		signosVit.setCodigo(1);
		signosVit.setDescripcion("Matutina");
		signosVit.setEnefermedades("Asma");
		signosVit.setPaciente(paciente);
		signosVit.setSintoma("Dolor estomacal");
		listSingos.add(signosVit);
		
		
		ejbCitafacade.create(new Cita("12", "28/07/2020", "11:40", paciente));
	}
		
	
}
