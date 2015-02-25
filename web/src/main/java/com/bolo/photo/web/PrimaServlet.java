package com.bolo.photo.web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bolo.photo.web.entity.User;
import com.bolo.photo.web.service.UserServiceImpl;

@WebServlet(urlPatterns="/ps")
public class PrimaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private UserServiceImpl service;

    public PrimaServlet() {
        // TODO Auto-generated constructor stub
    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User u = new User();
		u.setFirstName("Marco");
		u.setLastName("Bolognesi");
		service.create(u);
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
