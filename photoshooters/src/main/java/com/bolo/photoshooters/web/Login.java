package com.bolo.photoshooters.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.servlet.http.Part;

import com.bolo.photoshooters.vo.UtenteVO;

@ManagedBean(name = "login")
@SessionScoped
public class Login {
	private UtenteVO utenteLoggato = null;

	private String username;
	private String password;

	public String login() {
		utenteLoggato = new UtenteVO();
		utenteLoggato.setName(username);
		utenteLoggato.setPassword(password);
		return "home";
	}

	public UtenteVO getUtenteLoggato() {
		return utenteLoggato;
	}

	public void setUtenteLoggato(UtenteVO utenteLoggato) {
		this.utenteLoggato = utenteLoggato;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
