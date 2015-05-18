package com.bolo.photoshooters.web;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import com.bolo.photo.web.entity.Sesso;
import com.bolo.photo.web.entity.TipoUtente;
import com.bolo.photo.web.entity.Utente;
import com.bolo.photoshooters.service.ServiziComuni;
import com.bolo.photoshooters.service.ServiziComuniImpl;
import com.bolo.photoshooters.service.ServiziVari;
import com.bolo.photoshooters.service.ServiziVariImpl;


@ManagedBean
@SessionScoped
public class UtenteBean {

	private Utente utente;
	private String nome;
	private Sesso sesso;
	private Date dataNascita;
	private ServiziComuni serv = new ServiziComuniImpl();



	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
	public void aggiornaProfilo() {
		
		try {

			utente.setName(nome);
			utente.setSesso(sesso);
			utente.setDataNascita(dataNascita);
			serv.persist(utente);

		} catch (Exception e) {
			e.printStackTrace();
			//contentBean.setContent("profilo.xhtml");
		}
		
		//contentBean.setContent(null);
		//FacesContext.getCurrentInstance().getPartialViewContext().getRenderIds().add("content");
	}

	public Sesso getSesso() {
		return sesso;
	}

	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	
}