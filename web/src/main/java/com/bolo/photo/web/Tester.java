package com.bolo.photo.web;

import javax.persistence.Persistence;

import com.bolo.photo.web.entity.Annuncio;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence.createEntityManagerFactory("PHOTO_PU").createEntityManager().find(Annuncio.class, 1);
	}

}
