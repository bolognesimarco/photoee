package com.bolo.photo.web.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bolo.photo.web.entity.User;

@Stateless
public class UserServiceImpl {
	
	
	@PersistenceContext(unitName = "com.bolo.photo.web-mysql_war_0.0.1-SNAPSHOTPU")
    private EntityManager em;
	
	public void create(User u) {
		em.persist(u);
	}

}
