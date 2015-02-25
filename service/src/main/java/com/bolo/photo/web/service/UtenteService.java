package com.bolo.photo.web.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bolo.photo.web.entity.TipoUtente;
import com.bolo.photo.web.entity.Utente;

@Stateless
public class UtenteService {
	
	
	@PersistenceContext(unitName = "PHOTO_PU")
    private EntityManager em;
	
	public void create(Utente u) {
		em.persist(u);
	}
	
	
	public void create(TipoUtente tu) {
		em.persist(tu);
	}

}
