package com.bolo.photo.web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bolo.photo.web.entity.TipoUtente;
import com.bolo.photo.web.entity.Utente;
import com.bolo.photo.web.service.UtenteService;

@WebServlet(urlPatterns="/ps")
public class PrimaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private UtenteService service;

    public PrimaServlet() {
        // TODO Auto-generated constructor stub
    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utente u = new Utente();
		TipoUtente tu = new TipoUtente();
		tu.setDescrizione("Fotografo");
		u.setName("Marco");
		u.setPassword("Bolognesi");
		u.setTipoUtente(tu);
		service.create(tu);
		service.create(u);
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
