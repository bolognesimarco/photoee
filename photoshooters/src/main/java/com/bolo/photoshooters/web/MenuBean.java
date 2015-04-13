package com.bolo.photoshooters.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MenuBean {
	private String home,photoshooters,lavoro,forum,site,registrati,login;
	
	

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getPhotoshooters() {
		return photoshooters;
	}

	public void setPhotoshooters(String photoshooters) {
		this.photoshooters = photoshooters;
	}

	public String getLavoro() {
		return lavoro;
	}

	public void setLavoro(String lavoro) {
		this.lavoro = lavoro;
	}

	public String getForum() {
		return forum;
	}

	public void setForum(String forum) {
		this.forum = forum;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getRegistrati() {
		return registrati;
	}

	public void setRegistrati(String registrati) {
		System.out.println("REGISTRATIIIIIIIIIIIIIIIIIIIIII");
		contentBean.setContent("registrati.xhtml");
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public ContentBean getContentBean() {
		return contentBean;
	}

	public void setContentBean(ContentBean contentBean) {
		this.contentBean = contentBean;
	}
	
	@ManagedProperty(value="#{contentBean}")
	private ContentBean contentBean;
	
	
}
