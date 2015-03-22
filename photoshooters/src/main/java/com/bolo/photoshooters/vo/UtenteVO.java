package com.bolo.photoshooters.vo;

import java.util.Date;

public class UtenteVO {
	
	private String name;
	private String password;
	private Date dataNascita;
	private int tipoUtente;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public int getTipoUtente() {
		return tipoUtente;
	}
	public void setTipoUtente(int tipoUtente) {
		this.tipoUtente = tipoUtente;
	}
	
	
	
	
}
