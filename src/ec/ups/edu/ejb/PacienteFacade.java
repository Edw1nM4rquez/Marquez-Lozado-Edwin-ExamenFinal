package ec.ups.edu.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.entidad.Cita;
import ec.ups.edu.entidad.Paciente;

public class PacienteFacade extends AbstractFacade<Paciente>{

	public PacienteFacade() {
		super(Paciente.class);
		// TODO Auto-generated constructor stub
	}

	@PersistenceContext(unitName = "Marquez-Lozado-Edwin-ExamenFinal")
	private EntityManager entityManager;
	
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return entityManager;
	}
	
}
