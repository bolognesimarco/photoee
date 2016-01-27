package com.bolo.photoshooters.service;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

public interface ServiziComuni {
	public <T extends Serializable> void persist(T t, EntityManager em) throws Exception;
	public <T extends Serializable> void persist(T t) throws Exception;
	
	
	public <T extends Serializable> void deleteAll(Class<T> t, EntityManager em) throws Exception;
	public <T extends Serializable> void deleteAll(Class<T> t) throws Exception;
	
	public <T extends Serializable> T getReference(Class<T> c, int id, EntityManager em) throws Exception;
	public <T extends Serializable> T getReference(Class<T> c, int id) throws Exception;
	
	public <T extends Serializable> List<T> getAll(Class<T> c) throws Exception;
	public <T extends Serializable> List<T> getAll(Class<T> c, EntityManager em) throws Exception;

	public <T extends Serializable> T getById(Class<T> c, Object id) throws Exception;
	public <T extends Serializable> T getById(Class<T> c, Object id, EntityManager em) throws Exception;
	
	public <T extends Serializable> void merge(T t, EntityManager em) throws Exception;
	public <T extends Serializable> void merge(T t) throws Exception;
	//ciao ciao release ciao
}
