package ec.ups.edu.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.entidad.Cita;

@Stateless
public class CitaFacade extends AbstractFacade<Cita> {

	public CitaFacade() {
		super(Cita.class);
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
