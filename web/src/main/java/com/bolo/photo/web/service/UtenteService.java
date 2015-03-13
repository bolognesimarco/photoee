package com.bolo.photo.web.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bolo.photo.web.EMF;
import com.bolo.photo.web.entity.TipoUtente;
import com.bolo.photo.web.entity.Utente;

@Stateless
public class UtenteService {
	final static Logger logger = LoggerFactory.getLogger(UtenteService.class);	
	
    private EntityManager em = EMF.createEntityManager();
	
	
	public void create(Utente u) {
		em.persist(u);
	}
	
	public TipoUtente getTipoUtente(int tipo){
		return em.find(TipoUtente.class, tipo);
	}
	
	public List<TipoUtente> listTipoUtente() throws Exception{
		TypedQuery<TipoUtente> query = em.createQuery("SELECT tu from TipoUtente tu", TipoUtente.class);
		return query.getResultList();
	}

}
