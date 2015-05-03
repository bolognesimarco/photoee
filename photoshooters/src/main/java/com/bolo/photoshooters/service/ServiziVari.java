package com.bolo.photoshooters.service;

import com.bolo.photo.web.entity.Utente;

public interface ServiziVari {
	public boolean utenteEsiste(String username) throws Exception;
	public Utente activateUser(String activationCode) throws Exception;
	public Utente login(String username, String password) throws Exception;
}
