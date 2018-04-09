/**
 * @author Romerito Alencar 
 * mail: romerito.alencar@gmail.com
 *
 *Empresa: James Softeware
 * wwww.jamessoftware.com.br
 * Fone 61 3054-6909
 */
package web;

import java.io.Serializable;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import mail.Mail;
import mail.MailRN;
import util.MailUtil;
import util.UtilException;

@ManagedBean(name="mailBean")
@RequestScoped
public class MailBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Mail mail = new Mail();
	private String 				addresses = "turmadaalegria@localhost";
	private String 				topic;
	private String 				textMessage;
	private String              eMail;

	public void enviarMensagem() throws UtilException {

		try {
			MailUtil mailUtil = new MailUtil();
			mailUtil.send(addresses, eMail, topic, textMessage);
			
			MailRN mailRN = new MailRN();
			mail.setEMail(eMail);
			mail.setTopic(topic);
			mail.setTextMessage(textMessage);
			mail.setData(new Date(System.currentTimeMillis()));
			mailRN.salvar(mail);
		
		
		} catch (Exception e) {
			throw new UtilException(e);
		}
	}


	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getAddresses() {
		return addresses;
	}

	public void setAddresses(String addresses) {
		this.addresses = addresses;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getTextMessage() {
		return textMessage;
	}

	public void setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}

}