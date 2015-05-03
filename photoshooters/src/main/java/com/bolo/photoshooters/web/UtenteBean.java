package com.bolo.photoshooters.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.bolo.photo.web.entity.Utente;

@ManagedBean
@SessionScoped
public class UtenteBean {

	

	private Utente utente;

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
}