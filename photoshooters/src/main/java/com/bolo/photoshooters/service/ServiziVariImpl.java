package com.bolo.photoshooters.service;

import javax.persistence.EntityManager;

import com.bolo.photoshooters.web.EMF;

public class ServiziVariImpl implements ServiziVari {

	@Override
	public boolean utenteEsiste(String username) throws Exception {
		EntityManager em = EMF.createEntityManager();
		return em
				.createQuery("select u.id from Utente u where u.username=:username")
				.setParameter("username", username)
				.getResultList()
				.size()>0;
	}

}
