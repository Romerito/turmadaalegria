/**
 * @author Romerito Alencar 
 * mail: romerito.alencar@gmail.com
 *
 *Empresa: James Softeware
 * wwww.jamessoftware.com.br
 * Fone 61 3054-6909
 */
package util;

import mail.MailDAO;
import mail.MailDAOHibernate;

public class DAOFactory {
	
	public static MailDAO criarMailDAO() {
		MailDAOHibernate mailDAO = new MailDAOHibernate();
		mailDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return mailDAO;
	}
}

		
		
		
		
	
				