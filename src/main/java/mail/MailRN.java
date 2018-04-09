/**
 * @author Romerito Alencar 
 * mail: romerito.alencar@gmail.com
 *
 *Empresa: James Softeware
 * wwww.jamessoftware.com.br
 * Fone 61 3054-6909
 */
package mail;

import util.DAOFactory;

public class MailRN {

	private MailDAO mailDAO;

	public MailRN() {
		this.mailDAO = DAOFactory.criarMailDAO();
	}

	public void salvar(Mail mail) {
		String email = mail.getEMail();
		if (email != null) {
			this.mailDAO.salvar(mail);
		}
	}
}