package com.bolo.photo.web.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Messaggio {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column 
	private String messaggio;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="thread", nullable=false, updatable=false)
	private Thread thread;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="mittente", nullable=false, updatable=false)
	private Utente mittente;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="destinatario", nullable=false, updatable=false)
	private Utente destinatario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessaggio() {
		return messaggio;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	public Utente getMittente() {
		return mittente;
	}

	public void setMittente(Utente mittente) {
		this.mittente = mittente;
	}

	public Utente getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Utente destinatario) {
		this.destinatario = destinatario;
	}

}
