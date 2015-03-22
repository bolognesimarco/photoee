package com.bolo.photo.web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bolo.photo.web.entity.Sesso;
import com.bolo.photo.web.entity.TipoUtente;
import com.bolo.photo.web.entity.Utente;
import com.bolo.photo.web.service.UtenteService;
import com.bolo.photo.web.vo.TipoUtenteVO;
import com.bolo.photo.web.vo.UtenteVO;

@Path("/utente")
public class UtenteRestProvider  {
	final static Logger logger = LoggerFactory.getLogger(UtenteRestProvider.class);


	private UtenteService service = new UtenteService();
	
	private SimpleDateFormat yyyy_MM_dd = new SimpleDateFormat("yyyy-MM-dd");
	
	@POST @Path("/login") @Produces("application/json")
	public UtenteVO login(
			@FormParam("username") String username,
			@FormParam("password") String password
			){
		
		UtenteVO u = new UtenteVO();
		u.setName(username);
		u.setPassword(password);
		return u;
	}

    @POST
	public void nuovoUtente(
			@FormParam("username") String username, 
			@FormParam("password") String password,
			@FormParam("dataNascita") String dataNascita,
			@FormParam("sesso") String sesso,
			@FormParam("tipoUtente") String tipoUtente
			) throws ServletException, IOException {
		
    	TipoUtente tu = service.getTipoUtente(Integer.valueOf(tipoUtente));
    	
    	logger.info("Nuovo UTENTE !!!! - {} è un {}", username, tu.getDescrizione());

    	Utente u = new Utente();		
		u.setName(username);
		u.setPassword(password);
		try {
			u.setDataNascita(yyyy_MM_dd.parse(dataNascita));
		} catch (ParseException e) {
			logger.error("Error parsing dataNascita while nuovoUtente:"+dataNascita,e);
		}
		u.setSesso(Sesso.valueOf(sesso));
		u.setTipoUtente(tu);
		
		service.create(u);
	}
    
    @GET
    @Path("listTipoUtente")
    public List<TipoUtenteVO> listTipoUtente() throws Exception{
    	List<TipoUtente> tuList = service.listTipoUtente();
    	List<TipoUtenteVO> darit = new ArrayList<TipoUtenteVO>();
    	for (TipoUtente tipoUtente : tuList) {
			TipoUtenteVO vo = new TipoUtenteVO();
			vo.setId(tipoUtente.getId());
			vo.setDescrizione(tipoUtente.getDescrizione());
			darit.add(vo);
		}
    	return darit;
    }

}
