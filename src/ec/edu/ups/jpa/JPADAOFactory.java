 package ec.edu.ups.jpa;

import ec.edu.ups.dao.PersonaDAO;
import ec.edu.ups.dao.DAOFactory;

public class JPADAOFactory extends DAOFactory {

	@Override
	public PersonaDAO getPersonaDAO() {
		return new JPAPersonaDAO();
	}

}
