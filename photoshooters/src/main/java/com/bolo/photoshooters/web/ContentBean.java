package com.bolo.photoshooters.web;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ContentBean {
	private String content;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
