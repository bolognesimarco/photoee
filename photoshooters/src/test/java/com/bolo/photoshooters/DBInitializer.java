package com.bolo.photoshooters;

import javax.persistence.EntityManager;

import com.bolo.photo.web.entity.TipoUtente;
import com.bolo.photo.web.entity.Utente;
import com.bolo.photoshooters.service.ServiziComuni;
import com.bolo.photoshooters.service.ServiziComuniImpl;
import com.bolo.photoshooters.web.EMF;

public class DBInitializer {
	
	private ServiziComuni serv;
	
	public DBInitializer(){
		serv = new ServiziComuniImpl();
	}

	public static void main(String[] args) {
		System.setProperty("test.dal.mio.pc", "OK");
		DBInitializer dbInit = new DBInitializer();
		EntityManager em = EMF.createEntityManager();
		em.getTransaction().begin();
		
		
		
		try {
			
			dbInit.clean(em);
			dbInit.initTipiUtenti(em);
			
		
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
	}
	
	
	
	public void clean(EntityManager em) throws Exception{
		serv.deleteAll(Utente.class, em);
	}
	
	public void initTipiUtenti(EntityManager em) throws Exception{
		TipoUtente fotografo = new TipoUtente();
		fotografo.setId(1);
		fotografo.setDescrizione("fotografo");
		
		TipoUtente modella = new TipoUtente();
		modella.setId(2);
		modella.setDescrizione("modella");
		
		serv.deleteAll(TipoUtente.class, em);
		serv.persist(fotografo, em);
		serv.persist(modella, em);
	}

}
