package com.bolo.photo.web.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.bolo.photo.web.entity.User;

@Stateless
@Transactional
public class UserServiceImpl implements UserService {
	
	
	@PersistenceContext(unitName = "com.bolo.photo.web-mysql_war_0.0.1-SNAPSHOTPU")
    private EntityManager em;
	
	public void create(User u) {
		em.persist(u);
	}

}
