/**
 * @author Romerito Alencar 
 * mail: romerito.alencar@gmail.com
 *
 *Empresa: James Softeware
 * wwww.jamessoftware.com.br
 * Fone 61 3054-6909
 */
package mail;

import org.hibernate.Session;

public class MailDAOHibernate implements MailDAO {
	
	private Session session;
	
	public void setSession(Session session) {
		this.session = session; 
	}

	public void salvar(Mail mail) {
		this.session.save(mail);
		
	}

}
