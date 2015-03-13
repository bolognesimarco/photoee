package com.bolo.photo.web.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Thread {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private boolean cancellatoMittentePrimo;
	
	@Column
	private boolean cancellatoDestinatarioPrimo;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="annuncio", nullable=false, updatable=false)
	private Annuncio annuncio;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="thread")
	private List<Messaggio> messaggi;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="mittentePrimo", nullable=false, updatable=false)
	private Utente mittentePrimo;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="destinatarioPrimo", nullable=false, updatable=false)
	private Utente destinatarioPrimo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isCancellatoMittentePrimo() {
		return cancellatoMittentePrimo;
	}

	public void setCancellatoMittentePrimo(boolean cancellatoMittentePrimo) {
		this.cancellatoMittentePrimo = cancellatoMittentePrimo;
	}

	public boolean isCancellatoDestinatarioPrimo() {
		return cancellatoDestinatarioPrimo;
	}

	public void setCancellatoDestinatarioPrimo(boolean cancellatoDestinatarioPrimo) {
		this.cancellatoDestinatarioPrimo = cancellatoDestinatarioPrimo;
	}

	public Annuncio getAnnuncio() {
		return annuncio;
	}

	public void setAnnuncio(Annuncio annuncio) {
		this.annuncio = annuncio;
	}

	public List<Messaggio> getMessaggi() {
		return messaggi;
	}

	public void setMessaggi(List<Messaggio> messaggi) {
		this.messaggi = messaggi;
	}

	public Utente getMittentePrimo() {
		return mittentePrimo;
	}

	public void setMittentePrimo(Utente mittentePrimo) {
		this.mittentePrimo = mittentePrimo;
	}

	public Utente getDestinatarioPrimo() {
		return destinatarioPrimo;
	}

	public void setDestinatarioPrimo(Utente destinatarioPrimo) {
		this.destinatarioPrimo = destinatarioPrimo;
	}
}
